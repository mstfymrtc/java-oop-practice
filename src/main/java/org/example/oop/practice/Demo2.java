package org.example.oop.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.example.oop.practice.BusinessCustomer.BusinessSize.LARGE;

public class Demo2 {
    public static void main(String[] args) {
        Customer janeDoe = new Customer("Jane Doe");
        Customer acme = new BusinessCustomer("Acme Products", LARGE);
        Customer globex = new BusinessCustomer("Globex Corp", LARGE);
        Customer saveTheWorld = new NonprofitCustomer("Save the World");

        List<Customer> customers = List.of(janeDoe, acme, globex, saveTheWorld);
        Map<Integer, Long> discountMap = customers.stream().collect(Collectors.groupingBy(Customer::calculateDiscount, Collectors.
                counting()));
        System.out.println(discountMap);

        System.out.println(acme.toString());
    }
}
