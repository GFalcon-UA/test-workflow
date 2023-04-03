package ua.com.gfalcon.screener.finviz.filter.params;

import lombok.Getter;
import ua.com.gfalcon.screener.finviz.filter.FilterParameter;

public enum ReturnOnEquity implements FilterParameter {
    POSITIVE("fa_roe_pos"),
    NEGATIVE("fa_roe_neg"),
    VERY_POSITIVE("fa_roe_verypos"),
    VERY_NEGATIVE("fa_roe_veryneg");

    @Getter
    private final String value;

    ReturnOnEquity(String value) {
        this.value = value;
    }

}
