package com.example.javaresttemplate.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class AvgPriceDto {
    private int mins;
    private double price;
    private String symbol;

    public AvgPriceDto(int mins, double price, String symbol) {
    }
}
