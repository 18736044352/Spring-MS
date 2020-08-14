package com.java.provider.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ms-provider")
public class MSPrivoderController {

    @RequestMapping("first")
    public String first(){
        return "first micro service";
    }
}
