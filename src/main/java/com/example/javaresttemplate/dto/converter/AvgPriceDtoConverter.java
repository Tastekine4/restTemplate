package com.example.javaresttemplate.dto.converter;

import com.example.javaresttemplate.dto.AvgPriceDto;
import com.example.javaresttemplate.model.AvgPrice;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class AvgPriceDtoConverter {
   public AvgPriceDto convert(AvgPrice from){
        return new AvgPriceDto(from.getMins(), from.getPrice(), from.getSymbol());
   }
}
