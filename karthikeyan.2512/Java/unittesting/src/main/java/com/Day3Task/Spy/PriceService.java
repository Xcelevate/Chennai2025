package com.Day3Task.Spy;

public class PriceService {

   public int applyTax(int price) {
        return price + (price * 10 / 100);  // adds 10% tax
    }

    public int totalPrice(int item1Price, int item2Price) {
        return applyTax(item1Price) + applyTax(item2Price);
    }
}
