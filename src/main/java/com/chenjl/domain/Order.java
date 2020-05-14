package com.chenjl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order implements Serializable{
    private static final long serialVersionUID = 1120635411006621502L;

    private Payment payment;

    private List<Pizza> pizzas;

    private Customer customer;

    public Order() {
        pizzas = new ArrayList<Pizza>();
        customer = new Customer();
    }
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void addPizzas(Pizza pizza) {
        pizzas.add(pizza);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Float getTotal(){
        return 0.00f;
    }
}
