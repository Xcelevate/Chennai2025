package com.Practice;

public class PaymentService {

     int calculateTax(int amount) {
        return amount * 10 / 100; // 10% tax
    }

    public int finalAmount(int amount) {
        return amount + calculateTax(amount);
    }
}
