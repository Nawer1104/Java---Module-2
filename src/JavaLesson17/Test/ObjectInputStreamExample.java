package JavaLesson17.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputStreamExample {
    public static List<Product> products = new ArrayList<>();
    public static void main(String args[]) throws Exception {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("product.txt"));
            products = (List<Product>) ois.readObject();

            for (Product x : products
                 ) {
                System.out.println(x);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
