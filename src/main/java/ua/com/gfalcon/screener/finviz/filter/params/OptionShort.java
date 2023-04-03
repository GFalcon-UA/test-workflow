package ua.com.gfalcon.screener.finviz.filter.params;

import lombok.Getter;
import ua.com.gfalcon.screener.finviz.filter.FilterParameter;

public enum OptionShort implements FilterParameter {
    OPTIONABLE("sh_opt_option"),
    SHORTABLE("sh_opt_short"),
    OPTIONABLE_AND_SHORTABLE("sh_opt_optionshort");

    @Getter
    private final String value;

    OptionShort(String value) {
        this.value = value;
    }

}
