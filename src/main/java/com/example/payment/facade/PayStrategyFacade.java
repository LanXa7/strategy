package com.example.payment.facade;

import com.example.payment.strategy.PayStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PayStrategyFacade {

    private final List<PayStrategy> payStrategies;

    public String execute(String type) {
        return payStrategies.stream()
                .filter(item -> item.type().equals(type))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("非法类型"))
                .execute();
    }
}
