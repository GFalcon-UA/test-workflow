package ua.com.gfalcon.screener.finviz.filter.params;

import lombok.Getter;
import ua.com.gfalcon.screener.finviz.filter.FilterParameter;

public enum QuickRatio implements FilterParameter {
    HIGH("fa_quickratio_high"),
    LOW("fa_quickratio_low");

    @Getter
    private final String value;

    QuickRatio(String value) {
        this.value = value;
    }

}
