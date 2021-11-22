package JavaLesson12.Pratice.View;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    ProductView productView = new ProductView();

    public Menu() {
        System.out.println("MENU MANAGE PRODUCT");
        System.out.println("1. Create new product");
        System.out.println("2. Show Products List");
        System.out.println("3. Delete Product by Id");
        System.out.println("4. Find Product Detail by Id ");
        System.out.println("5. Edit Product Information");
        System.out.println("6. Sort Products List by Price - from lower to higher");
        System.out.println("7. Sort Products List by Price - from higher to lower");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                productView.addNewProduct();
                break;
            case 2:
                productView.showAllProduct();
                break;
            case 3:
                productView.deleteById();
                break;
            case 4:
                productView.searchProductById();
                break;
            case 5:
                productView.editProductById();
                break;
            case 6:
                productView.sortProductPriceLowerToHigher();
                break;
            case 7:
                productView.sortProductPriceHigherToLower();
                break;
        }
    }

    public static void main(String[] args) {
        new Menu();
    }
}
