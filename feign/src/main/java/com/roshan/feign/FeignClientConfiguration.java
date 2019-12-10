package com.roshan.feign;

import feign.Contract;
import feign.Logger;
import feign.Retryer;
import feign.codec.Decoder;
import feign.codec.Encoder;
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
        return Logger.Level.FULL;
    }
    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default();
    }
    @Bean
    public ErrorDecoder feignErrorDecoder() {
        return new ErrorDecoder.Default();
    }
    @Bean
    public Encoder feignEncoder() {
        return new Encoder.Default();
    }
    @Bean
    public Decoder feignDecoder() {
        return new Decoder.Default();
    }
//    @Bean
//    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
//        return new BasicAuthRequestInterceptor("user", "password");
//    }
}
