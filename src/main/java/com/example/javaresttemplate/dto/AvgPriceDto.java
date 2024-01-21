package com.example.javaresttemplate.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class AvgPriceDto {
    public int mins;
    public BigDecimal price;
    public String symbol;

    public AvgPriceDto(int mins, BigDecimal price, String symbol) {
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
        return "AvgPriceDto{" +
                "mins=" + mins +
                ", price=" + price +
                ", symbol='" + symbol + '\'' +
                '}';
    }
}
