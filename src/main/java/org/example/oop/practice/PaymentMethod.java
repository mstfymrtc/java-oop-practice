package org.example.oop.practice;

import java.util.Optional;

public interface PaymentMethod {
    Optional<Payment> makePayment(int value);
}
