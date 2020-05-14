package com.chenjl.domain;

import java.io.Serializable;
import java.util.List;

public class Pizza implements Serializable{

    private static final long serialVersionUID = -3961634976246307463L;

    private PizzaSize size;
    private List<Topping> toppings;

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}
