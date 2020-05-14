package com.chenjl.service;

import com.chenjl.domain.Customer;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public Customer findByPhoneNumber(String phoneNumber) throws CustomerNotFoundException {
        if (StringUtils.equals("18352510781", phoneNumber)) {
            Customer customer = new Customer();
            customer.setAddress("飘渺仙境");
            customer.setCity("华山");
            customer.setName("欧阳锋");
            customer.setPhoneNumber("18352510781");
            customer.setState("2");
            customer.setZipCode("022-3839111");
            return customer;
        } else {
            throw new CustomerNotFoundException();
        }
    }
}
