package com.chenjl.controller;

import com.chenjl.domain.Customer;
import com.chenjl.domain.Order;
import com.chenjl.domain.PaymentDetails;
import com.chenjl.service.CustomerNotFoundException;
import com.chenjl.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PizzaFlowActions {

    @Autowired
    CustomerService customerService;

    public Customer lookupCustomer (String phoneNumber) throws CustomerNotFoundException {
        Customer byPhoneNumber = customerService.findByPhoneNumber(phoneNumber);
        return byPhoneNumber;
    }

    // 查找是否在配送范围内
    public Boolean checkDeliveryArea(String zipCode) {
        System.out.println("查找到用户地址在配送范围内哦。。。。。。");
        return true;
    }

    public void addCustomer(Customer customer) {
        System.out.printf("顾客添加成功!");
    }

    public void verifyPayment(PaymentDetails paymentDetails) {
        System.out.println("支付处理中。。。。。。");
    }

    public void saveOrder(Order order) {
        System.out.println("保存订单。。。。");
    }

}
