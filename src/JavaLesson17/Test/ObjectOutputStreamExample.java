package JavaLesson17.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamExample {
    public static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product("IPhone 12", 2800000, "New"));
        productList.add(new Product("IPhone 13", 3800000, "New"));
        productList.add(new Product("IPhone 14", 5000000, "New"));
    }
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("product.txt"));
            oos.writeObject(productList);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("Success!");
    }
}
