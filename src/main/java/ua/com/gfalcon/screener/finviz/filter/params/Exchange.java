package ua.com.gfalcon.screener.finviz.filter.params;

import lombok.Getter;
import ua.com.gfalcon.screener.finviz.filter.FilterParameter;

public enum Exchange implements FilterParameter {
    AMEX("exch_amex"),
    NASDAQ("exch_nasd"),
    NYSE("exch_nyse");

    @Getter
    private final String value;

    Exchange(String value) {
        this.value = value;
    }
}
