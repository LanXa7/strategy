package com.example.payment.strategy;

import com.example.payment.commen.PayTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class YLPayStrategy implements PayStrategy{
    @Override
    public String type() {
        return PayTypeEnum.YL.getType();
    }

    @Override
    public String execute() {
        return PayTypeEnum.YL.getDesc();
    }
}
