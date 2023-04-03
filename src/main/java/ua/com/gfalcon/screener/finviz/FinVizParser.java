package ua.com.gfalcon.screener.finviz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import org.openqa.selenium.By;

//import com.codeborne.selenide.ElementsCollection;
//import com.codeborne.selenide.Selenide;
//import com.codeborne.selenide.SelenideElement;

import org.htmlunit.WebClient;
import org.htmlunit.html.DomNode;
import org.htmlunit.html.HtmlElement;
import org.htmlunit.html.HtmlPage;
import org.htmlunit.html.HtmlSpan;
import org.htmlunit.html.HtmlTable;

import ua.com.gfalcon.screener.finviz.filter.FilterParameter;
import ua.com.gfalcon.screener.finviz.filter.Presets;

public class FinVizParser {


    public List<String> loadFinVizResult() {
        List<String> tickers = new ArrayList<>();
        int count = 0;
        try(final WebClient client = new WebClient()) {
            client.getOptions().setCssEnabled(false);
            client.getOptions().setJavaScriptEnabled(false);
            RequestBuilder builder = new RequestBuilder();
//
            String url = builder.build(Presets.tradingStocks());
            HtmlPage page = client.getPage(url);
            HtmlTable table = (HtmlTable) page.getElementById("screener-views-table");
            count = table.getElementsByTagName("td")
                    .stream()
                    .filter(htmlElement -> htmlElement.getAttribute("class")
                            .equals("count-text"))
                    .map((Function<DomNode, String>) DomNode::getVisibleText)
                    .filter(s -> s.contains("Total:") && s.contains("#"))
                    .map(s -> s.split("#")[0])
                    .map(s -> Integer.parseInt(s.substring("Total:".length()).trim()))
                    .findFirst().orElse(-1);

            boolean nextLoad = false;
            for (int i = 1; i < count; i = i + 1000) {
                if (nextLoad) {
                    String newUrl = url + "&r=" + i;
                    page = client.getPage(newUrl);
                    table = (HtmlTable) page.getElementById("screener-views-table");
                }
                tickers.addAll(
                        table.getElementsByTagName("td")
                                .stream()
                                .filter(htmlElement -> htmlElement.getAttribute("class")
                                        .equals("screener-tickers"))
                                .flatMap((Function<HtmlElement, Stream<DomNode>>) htmlElement -> htmlElement.getChildNodes()
                                        .stream())
                                .filter(HtmlSpan.class::isInstance)
                                .map(DomNode::getVisibleText)
                                .map(String::trim)
                                .collect(Collectors.toList())
                );
                nextLoad = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(count < 0) {
            throw new RuntimeException("The count is not recognized");
        }
        if(tickers.size() != count) {
            throw new RuntimeException("Count mismatched");
        }
        return tickers;
    }
}
