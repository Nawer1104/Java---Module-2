package JavaLesson12.PraticeMVC.Controller;

import JavaLesson12.PraticeMVC.Model.Product;
import JavaLesson12.PraticeMVC.Service.ProductManagement;

import java.util.List;

public class ProductController {
        ProductManagement productManagement = new ProductManagement();

    public void addProduct(Product product) {
        productManagement.add(product);
    }

    public List<Product> showAllProduct() {
        return productManagement.show();
    }

    public void removeById(int id) {
        productManagement.deleteById(id - 1);
    }

    public Product detailProductById(int id) {
        return productManagement.searchProductById(id);
    }

    public void sortProductListLowerToHigher(){
        productManagement.sortByPriceLowerToHigher();
    }

    public void sortProductListHigherToLower(){
        productManagement.sortByPriceHigherToLower();
    }
}
