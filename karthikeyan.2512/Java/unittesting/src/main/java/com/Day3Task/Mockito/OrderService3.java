package com.Day3Task.Mockito;

public class OrderService3 {
    private final Inventory inv;
    private final PaymentGateway gw;
    OrderService3(Inventory inv, PaymentGateway gw) {
        this.inv = inv; this.gw = gw;
    }

    public String place(String sku, String id, int amount) {
        if (!inv.inStock(sku))
            return "out_of_stock";
        return gw.charge(id, amount);
    }
}
