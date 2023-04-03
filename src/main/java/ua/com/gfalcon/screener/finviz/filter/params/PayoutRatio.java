package ua.com.gfalcon.screener.finviz.filter.params;

import lombok.Getter;
import ua.com.gfalcon.screener.finviz.filter.FilterParameter;

public enum PayoutRatio implements FilterParameter {
    NONE("fa_payoutratio_none"),
    POSITIVE("fa_payoutratio_pos"),
    LOW("fa_payoutratio_low"),
    HIGH("fa_payoutratio_high");

    @Getter
    private final String value;

    PayoutRatio(String value) {
        this.value = value;
    }

}
