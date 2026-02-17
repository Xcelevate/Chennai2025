package test.question1;


import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        IInventory inventory = new Inventory();
        int pCount = Integer.parseInt(br.readLine().trim());
        for (int i = 1; i <= pCount; i++) {
            String[] a = br.readLine().trim().split(" ");
            IProduct e = new Product();
            e.setName(a[0]);
            e.setCategory(a[1]);
            e.setStock(Integer.parseInt(a[2]));
            e.setPrice(Integer.parseInt(a[3]));
            inventory.addProduct(e);
        }
        String[] b = br.readLine().trim().split(" ");
        String randomCategoryName = b[0];
        String randomProductName = b[1];
        String productName = b[2];

        List<IProduct> getProductsByCategory = inventory.getProductsByCategory(randomCategoryName);

        out.println(randomCategoryName + ":");
        for (IProduct product : getProductsByCategory) {
            out.println("Product Name:" + product.getName() + " Category:" + product.getCategory());
        }

        List<IProduct> searchProductsByName = inventory.searchProductsByName(randomProductName);
        out.println(randomProductName + ":");
        for (IProduct product : searchProductsByName) {
            out.println("Product Name:" + product.getName() + " Category:" + product.getCategory());
        }
        out.println("Total Value:$" + inventory.calculateTotalValue());

        Map<String, Integer> getProductsByCategoryWithCount = inventory.getProductsByCategoryWithCount();
        for (Map.Entry<String, Integer> item : getProductsByCategoryWithCount.entrySet()) {
            out.println(item.getKey() + ":" + item.getValue());
        }

        Map<String, List<IProduct>> getAllProductsByCategory = inventory.getAllProductsByCategory();
        for (Map.Entry<String, List<IProduct>> item : getAllProductsByCategory.entrySet()) {
            out.println(item.getKey() + ":");
            for (IProduct item2 : item.getValue()) {
                out.println("Product Name:" + item2.getName() + " Price:" + item2.getPrice());
            }
        }

        List<IProduct> productsToDelete = inventory.searchProductsByName(productName);
        for (IProduct product : productsToDelete) {
            inventory.removeProduct(product);
        }
        out.println("New Total Value:$" + inventory.calculateTotalValue());

        out.flush();
        out.close();
    }
}