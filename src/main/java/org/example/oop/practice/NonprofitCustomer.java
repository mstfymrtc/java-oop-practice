package org.example.oop.practice;

public class NonprofitCustomer extends Customer {
    public NonprofitCustomer(String name) {
        super(name);
    }

    @Override
    public int calculateDiscount() {
        return 15;
    }
}
