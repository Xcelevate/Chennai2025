package stream.question;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private Product product;

    public User(int id, String name, Product product) {
        this.id = id;
        this.name = name;
        this.product = product;
    }
    public User() {}

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
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    List<User> getUsers() {
        Product obj = new Product();
        List<User> userList = new ArrayList<>();
        String[] names = {"Karthik", "Vijay", "Ajith", "Karthi", "Ravi", "Attakathi", "Suresh", "Surya", "Vikram", "Dhanush"};
        int[] id ={123, 456, 789, 234, 678, 345, 912, 567, 843, 299};
        List<Product> prod = obj.getProducts();
        for (int i = 0; i < 10; i++) {
            userList.add(new User(id[i] , names[i] , prod.get(i)));
        }
        return userList;
    }
}
