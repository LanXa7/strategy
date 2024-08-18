package com.example.payment.strategy;


import com.example.payment.commen.PayTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class WXPayStrategy implements PayStrategy {

    @Override
    public String type() {
        return PayTypeEnum.WX.getType();
    }

    @Override
    public String execute() {
        return PayTypeEnum.WX.getDesc();
    }
}
