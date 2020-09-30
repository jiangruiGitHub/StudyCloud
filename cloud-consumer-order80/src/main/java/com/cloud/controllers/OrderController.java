package com.cloud.controllers;

import com.cloud.entities.CommonResult;
import com.cloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author LD_JRui
 * @ClassName OrderController
 * @date 2020/9/28 16:24
 * @Version 1.0
 **/
@RestController
@Slf4j
@RequestMapping("/api/consumer")
public class OrderController {
    @Resource
    private RestTemplate restTemplate;
    private final String PAYMENT_URL="http://localhost:8001";
    @RequestMapping("/addPayment")
    public CommonResult<Payment> add(Payment payment){
       return restTemplate.postForObject(PAYMENT_URL+"/api/payment/add",payment,CommonResult.class);
    }
}
