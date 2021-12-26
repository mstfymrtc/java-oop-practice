package org.example.oop.practice;

import java.util.UUID;

public class Demo3 {
    public static void main(String[] args) {
        // DECORATOR PATTERN EXAMPLE

        PaymentMethod eftAccount = new EftAccount("mustafa.yumurtaci@trendyol.com");

        // create a payment using that EFT account
        PaymentIntf payment = new Payment(eftAccount, 100, UUID.randomUUID());

        // create a payment with the same characteristics but with added verification
        PaymentIntf highValuePayment = new HighValuePayment(payment);

        // make a reversible payment from either one
        ReversiblePayment reversibleHighValuePayment = new ReversiblePayment(highValuePayment);
    }
}
