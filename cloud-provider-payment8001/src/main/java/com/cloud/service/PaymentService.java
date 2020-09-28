package com.cloud.service;

import com.cloud.dao.PaymentDao;
import com.cloud.entities.Payment;

import javax.annotation.Resource;

/**
 * @author LD_JRui
 * @ClassName PaymentService
 * @date 2020/9/28 15:20
 * @Version 1.0
 **/
public interface PaymentService {

    int add(Payment payment);
    Payment getPaymentById(Long id);
}
