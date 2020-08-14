package com.java.consumer.service;

import com.java.consumer.service.interfaces.FirstServiceStub;
import org.springframework.stereotype.Component;

@Component
public class FirstHystrixService implements FirstServiceStub {
    @Override
    public String first() {
        return "Fail";
    }
}
