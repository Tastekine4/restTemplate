package com.example.javaresttemplate.service;

import com.example.javaresttemplate.dto.AvgPriceDto;
import com.example.javaresttemplate.dto.converter.AvgPriceDtoConverter;
import com.example.javaresttemplate.model.AvgPrice;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
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

    @Scheduled(fixedDelay = 1000, initialDelay = 1000)
    public AvgPriceDto getAvgPrice(String symbol) {
        AvgPrice avgPrice = restTemplate.getForObject("https://api1.binance.com/api/v3/avgPrice?symbol="+symbol, AvgPrice.class);
       avgPrice.setSymbol(symbol);
        return converter.convert(avgPrice);
    }

    public static void main(String[] args) {
        RestTemplate restTemplate1= new RestTemplate();
        AvgPrice avgPrice = restTemplate1.getForObject("https://api1.binance.com/api/v3/avgPrice?symbol=BTCUSDT", AvgPrice.class);
        System.out.println(avgPrice);
    }
}

