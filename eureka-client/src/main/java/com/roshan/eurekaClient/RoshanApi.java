package com.roshan.eurekaClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@RestController
public class RoshanApi {
    @RequestMapping("/testGateway")
    public String testGateway() {
        return "hello world";
    }

    @GetMapping("/testAddParameter")
    public String testAddParameter(String foo, HttpServletRequest request) {
        System.out.println(request);
        return "parameter foo is: " + foo;
    }
}
