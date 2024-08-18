package com.example.payment.commen;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PayTypeEnum {

    ZFB("0", "支付宝"),
    WX("1", "微信"),
    YL("2", "银联");

    private final String type;
    private final String desc;
}
