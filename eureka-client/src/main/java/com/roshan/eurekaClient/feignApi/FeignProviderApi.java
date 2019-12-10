package com.roshan.eurekaClient.feignApi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignProviderApi {
    @RequestMapping("/getUser")
    public String getUser() {
        return "roshan";
    }
}
