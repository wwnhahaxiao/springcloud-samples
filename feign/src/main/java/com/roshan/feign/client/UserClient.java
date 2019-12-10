package com.roshan.feign.client;

import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "eureka-client", url = "localhost:997")
public interface UserClient {
    @RequestLine("GET /getUser")
    String getUser();
}
