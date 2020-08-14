package com.java.consumer.controllers;

import com.java.consumer.service.interfaces.FirstServiceStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ms-consumer")
public class FirstController {

    @Autowired
    private FirstServiceStub firstServiceStub;

    @RequestMapping("first")
    public String getMessage(){
        String message = firstServiceStub.first();
        return message;
    }
}
