package org.example.oop.practice;

public class NonprofitCustomer extends Customer {
    public NonprofitCustomer(String name, long ccNumber) {
        super(name, ccNumber);
    }

    @Override
    public int calculateDiscount() {
        return 15;
    }
}
