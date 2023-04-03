package ua.com.gfalcon.screener.finviz.filter.params;

import lombok.Getter;
import ua.com.gfalcon.screener.finviz.filter.FilterParameter;

public enum PE implements FilterParameter {
    LOW("fa_pe_low"),
    PROFITABLE("fa_pe_profitable"),
    HIGH("fa_pe_high");

    @Getter
    private final String value;

    PE(String value) {
        this.value = value;
    }

}
