package com.roshan.feign;

import feign.Contract;
import feign.Logger;
import feign.Retryer;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

//@Configuration
public class FeignClientConfiguration {
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.BASIC;
    }
    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default();
    }
    @Bean
    public ErrorDecoder feignErrorDecoder() {
        return new ErrorDecoder.Default();
    }

//    @Bean
//    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
//        return new BasicAuthRequestInterceptor("user", "password");
//    }
}