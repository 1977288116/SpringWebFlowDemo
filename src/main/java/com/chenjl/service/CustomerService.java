package com.chenjl.service;

import com.chenjl.domain.Customer;

public interface CustomerService {

    public Customer findByPhoneNumber (String phoneNumber) throws CustomerNotFoundException;

}
