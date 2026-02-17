package test.question1;


public class Product implements IProduct {
    private String name;
    private String category;
    private int stock;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public int getStock() {
        return this.stock;
    }

    public int getPrice() {
        return this.price;
    }
}
