package com.roshan.eurekaClient.feignApi;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignProviderApi {
    public String getUser() {
        return "roshan";
    }
}
