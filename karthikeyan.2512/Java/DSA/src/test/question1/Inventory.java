package test.question1;

import java.util.*;
import java.util.Collections;

public class Inventory implements IInventory {

    List<IProduct> products;

        Inventory(){
            this.products = new ArrayList<>();
        }
       @Override
       public void addProduct(IProduct product) {
            if(product != null){
                this.products.add(product);
            }
       }
       @Override
       public void removeProduct(IProduct product) {
            if(product != null && this.products.contains(product)){
                this.products.remove(product);
            }
       }

       @Override
       public long calculateTotalValue() {
           long sum = 0;
           for (IProduct p : products) {
               sum += p.getStock() * p.getPrice();
           }
           return sum;
       }


    @Override
    public List<IProduct> getProductsByCategory(String category) {
        List<IProduct> catProducts = new ArrayList<>();
        for(IProduct p : products){
            if(p.getCategory().equals(category)){
                catProducts.add(p);
            }
        }
        Collections.sort(catProducts,new ProductNameComparator());
        return catProducts;
    }

    @Override
    public List<IProduct> searchProductsByName(String name) {
            List<IProduct> nameProduct = new ArrayList<>();
            for(IProduct p : products){
                if(p.getName().equals(name)){
                    nameProduct.add(p);
                }
            }
        return nameProduct;
    }

    @Override
    public Map<String, Integer> getProductsByCategoryWithCount() {
            Map<String, Integer> map = new TreeMap<>();
            for(IProduct p : products){
                map.merge(p.getCategory() , 1 , Integer::sum);
            }
            //Collections.sort( map , new ProductNameComparator());
        return map;
    }

    @Override
    public Map<String, List<IProduct>> getAllProductsByCategory() {
            Map<String, List<IProduct>> result = new TreeMap<>();
            Set<String>keys = new HashSet<>();
            for(IProduct p : products){
                keys.add(p.getCategory());
            }

            for(String key : keys) {
                List<IProduct> list = new ArrayList<>();
                for (IProduct p : products) {
                    if (p.getCategory().equals(key)) {
                        list.add(p);
                    }
                }
                Collections.sort(list, new ProductNameComparator());
                result.put(key, list);
            }
        return result;
    }
}
