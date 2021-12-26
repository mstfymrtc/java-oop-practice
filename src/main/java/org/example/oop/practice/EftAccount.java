package org.example.oop.practice;

import java.util.Optional;

public class EftAccount implements PaymentMethod {
    private String emailAddress;

    public EftAccount(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public Optional<Payment> makePayment(int value) {
        return Optional.empty();
    }
}
