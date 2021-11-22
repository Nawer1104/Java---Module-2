package JavaLesson12.Pratice.Service;

import JavaLesson12.Pratice.Model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManagement implements IProductManagementImpl {
    public static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product("Iphone 13 ProMax", 30.5));
        productList.add(new Product("MacBook Pro", 60.5));
        productList.add(new Product("SF Arcana", 0.5));
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public List<Product> show() {
        return productList;
    }

    @Override
    public void deleteById(int id) {
        productList.remove(id);
    }

    @Override
    public Product searchProductById(int id) {
        return productList.get(id - 1);
    }

    @Override
    public void sortByPriceLowerToHigher() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    if (o1.getPrice() == o2.getPrice()) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            }
        });
    }

    @Override
    public void sortByPriceHigherToLower() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() < o2.getPrice()) {
                    return 1;
                } else {
                    if (o1.getPrice() == o2.getPrice()) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
    }

}
