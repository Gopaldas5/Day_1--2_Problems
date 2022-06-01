package com.bridgeLabz;

import java.security.PublicKey;
import java.util.Scanner;

public class Stock {
    private final String shareName;
    private final int sharePrice;
    private final int numberOfShare;

    public String getShareName() {
        return shareName;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public int getNumberOfShare() {
        return numberOfShare;
    }

    public Stock(String shareName, int sharePrice, int numberOfShare) {
        super();
        this.shareName = shareName;
        this.sharePrice = sharePrice;
        this.numberOfShare = numberOfShare;

    }
}






