package com.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author LD_JRui
 * @ClassName AplicationContextConfig
 * @date 2020/9/28 16:29
 * @Version 1.0
 **/
@Configuration
public class AplicationContextConfig {
    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
