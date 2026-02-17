package test.question1;

import java.util.List;
import java.util.Map;

public interface IInventory {
    void addProduct(IProduct product);
    void removeProduct(IProduct product);
    long calculateTotalValue();
    List<IProduct> getProductsByCategory(String category);
    List<IProduct> searchProductsByName(String name);
    Map<String, Integer> getProductsByCategoryWithCount();
    Map<String, List<IProduct>> getAllProductsByCategory();
}

