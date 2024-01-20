package com.example.javaresttemplate.model;

import java.math.BigDecimal;

public class AvgPrice {
    private int mins;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String symbol;

    public AvgPrice(int mins, BigDecimal price, String symbol) {
    }

    public int getMins() {
        return mins;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

}
