package ua.com.gfalcon.screener.finviz.filter;

import java.util.List;

import ua.com.gfalcon.screener.finviz.filter.params.AverageVolume;
import ua.com.gfalcon.screener.finviz.filter.params.IPOdate;
import ua.com.gfalcon.screener.finviz.filter.params.Industry;
import ua.com.gfalcon.screener.finviz.filter.params.MarketCap;
import ua.com.gfalcon.screener.finviz.filter.params.OptionShort;
import ua.com.gfalcon.screener.finviz.filter.params.Price;

public class Presets {

    public static List<FilterParameter> dividendStocks() {
        return List.of(

        );
    }

    public static List<FilterParameter> riseStocks() {
        return List.of(

        );
    }

    public static List<FilterParameter> tradingStocks() {
        return List.of(
                MarketCap.SMALL_PLUS,
                Industry.STOCK,
                OptionShort.SHORTABLE,
                AverageVolume.OVER_500_K,
                IPOdate.MORE_THAN_5_YEARS_AGO//,
//                Price.FROM_1_TO_20
        );
    }
}
