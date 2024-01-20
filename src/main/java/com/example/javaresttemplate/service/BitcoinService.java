package com.example.javaresttemplate.service;

import com.example.javaresttemplate.dto.AvgPriceDto;
import com.example.javaresttemplate.dto.converter.AvgPriceDtoConverter;
import com.example.javaresttemplate.model.AvgPrice;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BitcoinService {

private final RestTemplate restTemplate;
private final AvgPriceDtoConverter converter;


    public BitcoinService(RestTemplate restTemplate, AvgPriceDtoConverter converter) {
        this.restTemplate = restTemplate;
        this.converter = converter;
    }

    public AvgPriceDto getAvgPrice(String symbol) {
        AvgPrice avgPrice = restTemplate.getForObject(
                "https://api.binance.com/api/v3/avgPrice?symbol="+ symbol,
               AvgPrice.class);
        System.out.println("https://api.binance.com/api/v3/avgPrice?symbol="+ symbol);
        avgPrice.setSymbol(symbol);
        return converter.convert(avgPrice);
    }
}

