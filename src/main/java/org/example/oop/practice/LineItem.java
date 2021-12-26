package org.example.oop.practice;

public class LineItem {
    private Product product;
    private int quantity;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public int getPrice() {
        PriceCalculator priceCalculator = product.createPriceCalculator();
        return priceCalculator.calculatePrice(quantity);
    }

    @Override
    public String toString() {
        return "LineItem{" +
                "product=" + product +
                ", quantity=" + quantity +
                '}';
    }

}
