package JavaLesson17.Test;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = -266706354210367639L;

    private int id;
    private String name;
    private double price;
    private String description;
    private static int idNumber = 1;

    public Product(String name, double price, String description) {
        this.id = idNumber++;
        this.name = name;
        this.price = price;
        this.description = description;
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product :" +
                "Id: " + id +
                ", Name: " + name +
                ", Price: " + price +
                ", Description: " + description;

    }
}