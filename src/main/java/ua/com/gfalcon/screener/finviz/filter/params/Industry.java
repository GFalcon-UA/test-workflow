package ua.com.gfalcon.screener.finviz.filter.params;

import lombok.Getter;
import ua.com.gfalcon.screener.finviz.filter.FilterParameter;

public enum Industry implements FilterParameter {
    STOCK("ind_stocksonly"),
    ETF("ind_exchangetradedfund");

    @Getter
    private final String value;

    Industry(String value) {
        this.value = value;
    }

}
