package ua.com.gfalcon.screener.finviz.filter;

import lombok.Getter;

public enum Signal {
    TOP_GAINERS("ta_topgainers"),
    TOP_LOSERS("ta_toplosers"),
    NEW_HIGH("ta_newhigh"),
    NEW_LOW("ta_newlow"),
    MOST_VOLATILE("ta_mostvolatile"),
    MOST_ACTIVE("ta_mostactive"),
    UNUSUAL_VOLUME("ta_unusualvolume");

    @Getter
    private final String value;

    Signal(String value) {
        this.value = value;
    }
}
