package ua.com.gfalcon.screener.finviz.filter.params;

import lombok.Getter;
import ua.com.gfalcon.screener.finviz.filter.FilterParameter;

public enum OperatingMargin implements FilterParameter {
    POSITIVE("fa_opermargin_pos"),
    NEGATIVE("fa_opermargin_neg"),
    VERY_NEGATIVE("fa_opermargin_veryneg"),
    HIGH("fa_opermargin_high");

    @Getter
    private final String value;

    OperatingMargin(String value) {
        this.value = value;
    }

}
