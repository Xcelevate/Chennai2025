package test.question2;


import java.util.*;

public class ShoppingCart implements IShoppingCart {
    Map<IProduct , Integer> products;
    public ShoppingCart() {
        this.products = new HashMap<IProduct , Integer>();
    }
    @Override
    public void addProduct(IProduct product, int quantity) {
        this.products.put(product, quantity);
    }

    @Override
    public void removeProduct(IProduct product, int quantity) {
        if(this.products.containsKey(product)) {
            this.products.remove(product);
        }
    }

    @Override
    public int checkout() {
        int sum = 0 ;
        for(IProduct product : products.keySet()) {
            sum += products.get(product) * product.getPrice();
        }
        return sum;
    }

    @Override
    public Map<String, Integer> productCategoryWithPrice() {
        Map<String, Integer> productCategory = new TreeMap<>();
        Set<String> productSet = new TreeSet<>();
        for(IProduct product : products.keySet()) {
            productSet.add(product.getCategory());
        }
        for(String product : productSet) {
            int sum =0 ;
            for(IProduct p : products.keySet()) {

                if(productCategory.containsKey(product)) {
                    sum += p.getPrice();
                }
            }
            productCategory.put(product, sum);
        }
        return productCategory;
    }

    @Override
    public List<ProductCount> productWithCount() {
        List<ProductCount> productCount = new ArrayList<>();
        for(IProduct p : products.keySet()){
            productCount.add(new ProductCount(p.getName() , products.get(p) , p.getPrice()));
        }
        return productCount;
    }
}
