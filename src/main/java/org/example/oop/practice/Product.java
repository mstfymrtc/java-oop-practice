package org.example.oop.practice;

public abstract class Product {
    private final String name;
    private int price;
    private float discount;

    protected Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public int getPrice() {
        int shippingCost = calculateShippingCost();
        return Math.round((1 - discount) * price) + shippingCost;
    }

    public abstract int calculateShippingCost();


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
