package com.roshan.feign.api;

import com.roshan.feign.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleApi {

    @Autowired
    private SimpleService simpleService;

    @RequestMapping("/simple")
    public String simple() {
        return simpleService.getSimpleMsgFromOtherClient();
    }
}
