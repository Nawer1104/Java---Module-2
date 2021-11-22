package JavaLesson12.PraticeMVC.View;

import JavaLesson12.PraticeMVC.Controller.ProductController;
import JavaLesson12.PraticeMVC.Model.Product;

import java.util.Scanner;

public class ProductView {
    Scanner scanner = new Scanner(System.in);
    ProductController productController = new ProductController();

    public void  addNewProduct() {
        while (true) {
            System.out.println("Enter product's name:");
            String name = scanner.nextLine();
            System.out.println("Enter product's price:");
            double price = Double.parseDouble(scanner.nextLine());
            Product newProduct = new Product(name, price);
            productController.addProduct(newProduct);
            System.out.println("Created success");
            System.out.println("Press any key to continue or type -quit to exit to Menu");
            String typeToExit = scanner.next();
            if (typeToExit.equalsIgnoreCase("quit")) {
                new Menu();
            }
        }
    }

    public void showAllProduct() {
        System.out.println("ID---NAME---Price");
        System.out.println("Size = " + productController.showAllProduct().size());
        for (int i = 0; i < productController.showAllProduct().size(); i++) {
            System.out.println(" " + productController.showAllProduct().get(i).getID()
                    + "  " + productController.showAllProduct().get(i).getName()
                    + "  " + productController.showAllProduct().get(i).getPrice()
            );
        }
        System.out.println("Type -quit to back to Menu");
        String typeToExit = scanner.next();
        if (typeToExit.equalsIgnoreCase("quit")) {
            new Menu();
        }
    }

    public void deleteById() {
        while (true) {
            System.out.println("Enter Product's Id number:");
            int id = Integer.parseInt(scanner.nextLine());
            productController.removeById(id);
            System.out.println("Deleted success");
            System.out.println("Press any key to continue of type -quit to back to Menu");
            String typeToExit = scanner.next();
            if (typeToExit.equalsIgnoreCase("quit")) {
                new Menu();
            }
        }
    }

    public void editProductById() {
        while (true) {
            System.out.println("Enter Product's Id number:");
            int id = Integer.parseInt(scanner.nextLine());
            Product product = productController.detailProductById(id);
            System.out.println(" " + product.getID()
                    + "  " + product.getName()
                    + "  " + product.getPrice());
            System.out.println("Which value of product's detail you want to edit?");
            System.out.println("Type -name if you want to edit name of " + product.getName());
            System.out.println("Type -price if you want to edit price of " + product.getName());
            String typeToEdit = scanner.next();
            scanner.nextLine();
            while (typeToEdit.equals("name") || typeToEdit.equals("price")) {
                if (typeToEdit.equalsIgnoreCase("name")) {
                    System.out.println("Enter product's name:");
                    String newName = scanner.nextLine();
                    product.setName(newName);
                }
                if (typeToEdit.equalsIgnoreCase("price")) {
                    System.out.println("Enter product's price:");
                    int price = Integer.parseInt(scanner.nextLine());
                    product.setPrice(price);
                }
                System.out.println("Edit success");
                System.out.println("Press any key to continue of type -quit to back to Menu");
                String typeToExit = scanner.next();
                if (typeToExit.equalsIgnoreCase("quit")) {
                    new Menu();
                }
            }
        }
    }

    public void searchProductById() {
        while (true) {
            System.out.println("Enter Product's Id number:");
            int id = Integer.parseInt(scanner.nextLine());
            Product product = productController.detailProductById(id);
            System.out.println(" " + product.getID()
                    + "  " + product.getName()
                    + "  " + product.getPrice());
            System.out.println("Press any key to continue of type -quit to back to Menu");
            String typeToExit = scanner.next();
            if (typeToExit.equalsIgnoreCase("quit")) {
                new Menu();
            }
        }
    }

    public void sortProductPriceLowerToHigher() {
        productController.sortProductListLowerToHigher();
        System.out.println("Sort success");
        System.out.println("Press any key to continue of type -quit to back to Menu");
        String typeToExit = scanner.next();
        if (typeToExit.equalsIgnoreCase("quit")) {
            new Menu();
        }
    }

    public void sortProductPriceHigherToLower() {
        productController.sortProductListHigherToLower();
        System.out.println("Sort success");
        System.out.println("Press any key to continue of type -quit to back to Menu");
        String typeToExit = scanner.next();
        if (typeToExit.equalsIgnoreCase("quit")) {
            new Menu();
        }
    }
}
