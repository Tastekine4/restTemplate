package com.example.javaresttemplate.model;

import java.math.BigDecimal;

public class AvgPrice {
    private int mins;
    private BigDecimal price;
    private String symbol;

    public AvgPrice(int mins, BigDecimal price, String symbol) {
        this.mins = mins;
        this.price = price;
        this.symbol = symbol;
    }

    public int getMins() {
        return mins;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "AvgPrice{" +
                "mins=" + mins +
                ", price=" + price +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
