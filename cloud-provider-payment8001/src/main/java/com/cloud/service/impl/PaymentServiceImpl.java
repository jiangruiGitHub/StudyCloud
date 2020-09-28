package com.cloud.service.impl;

import com.cloud.dao.PaymentDao;
import com.cloud.entities.Payment;
import com.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LD_JRui
 * @ClassName PaymentServiceImpl
 * @date 2020/9/28 15:21
 * @Version 1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int add(Payment payment) {
        return paymentDao.add(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPayMentById(id);
    }
}
