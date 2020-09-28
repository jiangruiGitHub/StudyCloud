package com.cloud.controllers;

import com.cloud.entities.CommonResult;
import com.cloud.entities.Payment;
import com.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author LD_JRui
 * @ClassName PaymentController
 * @date 2020/9/28 15:25
 * @Version 1.0
 **/
@Controller
@Slf4j
@RequestMapping("api/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/add")
    @ResponseBody
    public CommonResult add(Payment payment){
        int result=paymentService.add(payment);
        log.info("插入"+result+"条");
        if(result>0){
            return  new CommonResult(200,"成功");
        }else{
            return  new CommonResult(500,"失败");
        }
    }
    @GetMapping(value = "/get/{id}")
    @ResponseBody
    public CommonResult getPayment(@PathVariable("id") Long id){
        Payment result=paymentService.getPaymentById(id);
        if(Objects.nonNull(result)){
            return  new CommonResult(200,"成功",result);
        }else{
            return  new CommonResult(500,"失败");
        }
    }
}
