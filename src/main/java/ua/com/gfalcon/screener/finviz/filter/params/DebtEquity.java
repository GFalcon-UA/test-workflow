package ua.com.gfalcon.screener.finviz.filter.params;

import lombok.Getter;
import ua.com.gfalcon.screener.finviz.filter.FilterParameter;

public enum DebtEquity implements FilterParameter {
    HIGH("fa_debteq_high"),
    LOW("fa_debteq_low"),
    UNDER_1("fa_debteq_u1"),
    OVER_1("fa_debteq_o1");

    @Getter
    private final String value;

    DebtEquity(String value) {
        this.value = value;
    }

}
