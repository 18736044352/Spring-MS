package com.java.consumer.service.interfaces;

import com.java.consumer.service.FirstHystrixService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "MSProvider",fallback = FirstHystrixService.class)
public interface FirstServiceStub {

    @RequestMapping("/ms-provider/first")
    public String first();
}
