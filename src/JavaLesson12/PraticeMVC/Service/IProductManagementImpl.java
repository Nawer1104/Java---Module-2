package JavaLesson12.PraticeMVC.Service;

import JavaLesson12.PraticeMVC.Model.Product;

import java.util.List;

public interface IProductManagementImpl {
    void add(Product product);
    List<Product> show();
    void deleteById(int id);
    Product searchProductById(int id);
    void sortByPriceLowerToHigher();
    void sortByPriceHigherToLower();
}
