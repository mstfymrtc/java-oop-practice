package org.example.oop.practice;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        // To simulate the DB
        Product snowWheel = Catalogue.getProduct("Snow Wheel");
        Product tshirt = Catalogue.getProduct("Tshirt");
        Product warAndPeace = Catalogue.getProduct("War and Peace (e-book)");

        shoppingCart.addLineItem(new LineItem(snowWheel, 1));
        shoppingCart.addLineItem(new LineItem(tshirt, 1));
        shoppingCart.addLineItem(new LineItem(warAndPeace, 3));


        Customer customer = new Customer("Mustafa Yumurtacı");
        customer.addPaymentMethod("Mustafa's Credit Card", new CreditCard(1234999944445555L));
        customer.addPaymentMethod("Mustafa's Bank Account", new BankAccount("12349999","435345346575"));
        Optional<Order> order = customer.checkout(shoppingCart,"Mustafa's Credit Card");
        System.out.println(order);
    }
}
