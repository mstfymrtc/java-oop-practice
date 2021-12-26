package org.example.oop.practice;

//interface segregation principle
// clients should not be forced to depend upon interfaces that they do not use. (check DigitalProduct, it only implements Shippable interface)

public class PhysicalProduct extends Product implements Replaceable, Shippable {
    private int weight;
    private ShippingCategory shippingCategory;

    public PhysicalProduct(String name, int price, int weight) {
        super(name, price);
        this.weight = weight;
    }

    public int calculateShippingCost() {
        return weight * Catalogue.SHIPPING_RATE;
    }

    @Override
    public void replace() {
        // buy special insurance
    }

    @Override
    public void ship() {
        switch (shippingCategory) {
            case STANDARD: // standard courier
            case BULK: // large-capacity vehicles
            case PREMIUM: // buy insurence to secure the courier
        }

    }
}
