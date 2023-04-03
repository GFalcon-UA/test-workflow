package ua.com.gfalcon.screener.finviz.filter.params;

import lombok.Getter;
import ua.com.gfalcon.screener.finviz.filter.FilterParameter;

public enum MarketCap implements FilterParameter {
    NANO("cap_nano"),
    MICRO("cap_micro"),
    SMALL("cap_small"),
    MID("cap_mid"),
    LARGE("cap_large"),
    MEGA("cap_mega"),
    MICRO_PLUS("cap_microover"),
    SMALL_PLUS("cap_smallover"),
    MID_PLUS("cap_midover"),
    LARGE_PLUS("cap_largeover");

    @Getter
    private final String value;

    MarketCap(String value) {
        this.value = value;
    }

}
