package com.roshan.feign.client;

import com.roshan.feign.FeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(name = "users")
public interface UserClient {
    String getUser();
}
