package at.ase.shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gui {

    private List<Product> products = new ArrayList<Product>();
    private Scanner scanner = new Scanner(System.in);

    public void addProduct(Product product) {
        this.products.add(product);
    }


    public void run() {
        while (true) {
            System.out.println("1 Show Products ");
            System.out.println("2 Add Product ");
            System.out.println("3 Remove Product ");
            System.out.println("4 Show stock value ");
            System.out.println("5 Exit ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    showStockValue();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
    public void showProducts() {
        System.out.println("show products");
        for(Product product : products) {
            System.out.println(product.getName());
        }
    }

    

    public void addProduct() {
        System.out.println("Enter car color:");
        String color = scanner.next();
        System.out.println("Enter car name:");
        String name = scanner.next();
        products.add(new Car(color, name));
    }

    public void removeProduct() {
        System.out.println("Enter index of product to remove:");
        int index = scanner.nextInt();
        if (index >= 0 && index < products.size()) {
            products.remove(index);
        }
    }

    public void showStockValue() {
        System.out.println("Number of products in stock: " + products.size());
    }
}
