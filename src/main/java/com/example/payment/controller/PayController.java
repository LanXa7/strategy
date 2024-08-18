package com.example.payment.controller;

import com.example.payment.facade.PayStrategyFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pay")
@RequiredArgsConstructor
public class PayController {

    private final PayStrategyFacade payStrategyFacade;

    @GetMapping("/execute/{type}")
    public String execute(@PathVariable String type) {
        return payStrategyFacade.execute(type);
    }
}
