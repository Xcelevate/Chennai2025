package test.question2;

import java.util.*;

public interface IShoppingCart {
    void addProduct(IProduct product, int quantity);
    void removeProduct(IProduct product, int quantity);
    int checkout();
    Map<String, Integer> productCategoryWithPrice();
    List<ProductCount> productWithCount();
}
