package org.example.oop.practice;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        // Product snowWheel = new Product("Snow Wheel", 525);
        // Product tshirt = new Product("Tshirt", 45);

        // To simulate the DB
        Product snowWheel = Catelogue.getProduct("Snow Wheel");
        Product tshirt = Catelogue.getProduct("Tshirt");

        shoppingCart.addProduct(snowWheel);
        shoppingCart.addProduct(tshirt);
        System.out.println(shoppingCart);
        System.out.println(shoppingCart.getTotalCost());
    }
}
