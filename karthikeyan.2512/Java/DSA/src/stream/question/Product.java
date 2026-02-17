package stream.question;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private int id;
    private String name;
    private int price;
    private int weight;
    private String category;

    public Product(int id, String name, int price, int weight , String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.category = category;
    }
    public Product() {}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    List<Product> getProducts() {
        List<Product> productList = new ArrayList<>();
        int[] ids = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
        String[] names = {"Laptop", "Smartphone", "Java Book", "Tablet", "Smart TV", "Refrigerator", "Smart Watch", "Earphones", "Camera", "Office Chair"};
        int[] prices = {75000, 35000, 1200, 22000, 55000, 30000, 15000, 2000, 40000, 8000};
        int[] weights = {2, 1, 1, 1, 8, 45, 1, 1, 2, 12};
        String[] categories = {"Electronics","Electronics","Books","Electronics","Electronics","Appliances","Electronics","Accessories","Electronics","Furniture"};

        for (int i = 0; i < ids.length; i++) {
            productList.add(new Product(ids[i], names[i], prices[i], weights[i] , categories[i]));
        }
        return productList;
    }
    public String toString(){
        return "id:" + this.id + "  name:" + this.name +"   price:" + this.price + "  weight:" + this.weight + "  category:" + this.category;
    }
}
