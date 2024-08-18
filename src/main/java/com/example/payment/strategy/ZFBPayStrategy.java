package com.example.payment.strategy;

import com.example.payment.commen.PayTypeEnum;
import org.springframework.stereotype.Service;

@Service
public class ZFBPayStrategy implements PayStrategy {
    @Override
    public String type() {
        return PayTypeEnum.ZFB.getType();
    }

    @Override
    public String execute() {
        return PayTypeEnum.ZFB.getDesc();
    }
}
