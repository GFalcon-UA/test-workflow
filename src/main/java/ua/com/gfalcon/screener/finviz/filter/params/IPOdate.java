package ua.com.gfalcon.screener.finviz.filter.params;

import lombok.Getter;
import ua.com.gfalcon.screener.finviz.filter.FilterParameter;

public enum IPOdate implements FilterParameter {
    YEAR_AGO("ipodate_more1"),
    MORE_THAN_5_YEARS_AGO("ipodate_more5"),
    MORE_THAN_10_YEARS_AGO("ipodate_more10"),
    MORE_THAN_15_YEARS_AGO("ipodate_more15"),
    MORE_THAN_20_YEARS_AGO("ipodate_more20"),
    MORE_THAN_25_YEARS_AGO("ipodate_more25");

    @Getter
    private final String value;

    IPOdate(String value) {
        this.value = value;
    }

}
