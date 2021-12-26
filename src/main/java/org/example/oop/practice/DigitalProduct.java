package org.example.oop.practice;

public class DigitalProduct extends Product implements Shippable {
    public DigitalProduct(String name, int price) {
        super(name, price);
    }

    @Override
    public int calculateShippingCost() {
        return 0;
    }

    @Override
    public void ship() {
        // make avaible for download
    }
}
