package com.cloud.dao;

import com.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author LD_JRui
 * @ClassName paymentDao
 * @date 2020/9/28 12:04
 * @Version 1.0
 **/
@Mapper
public interface PaymentDao {
    public int add(Payment payment);
    public Payment getPayMentById(@Param("id") Long id);
}
