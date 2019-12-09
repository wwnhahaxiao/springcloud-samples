package com.roshan.feign.service;

import com.roshan.feign.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleService {

    @Autowired
    private UserClient userClient;

    public String getSimpleMsgFromOtherClient() {
        return userClient.getUser();
    }
}
