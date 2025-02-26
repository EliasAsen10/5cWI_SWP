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
            System.out.println("5 Add Car ");
            System.out.println("6 Add Bike ");
            System.out.println("7 Show Price ");
            System.out.println("8 Total Price ");
            System.out.println("9 Exit ");
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
                    addCar();
                    break;
                case 6:
                    addBike();
                    break;
                case 7:
                    showPrice();    
                    break;
                case 8:
                    totalPrice();
                    break;
                case 9:
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
        System.out.println("Enter car price:");
        double price = scanner.nextDouble();
        products.add(new Car(color, name, price));
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

    public void addCar() {
        System.out.println("Enter car color:");
        String color = scanner.next();
        System.out.println("Enter car name:");
        String name = scanner.next();
        System.out.println("Enter car price:");
        double price = scanner.nextDouble();
        products.add(new Car(color, name, price));
    }

    public void addBike() {
        System.out.println("Enter bike style:");
        String style = scanner.next();
        System.out.println("Enter bike name:");
        String name = scanner.next();
        System.out.println("Enter bike price:");
        double price = scanner.nextDouble();
        products.add(new Bike(style, name, price));
    }

    public void totalPrice() {
        double totalPrice = 0;
        for(Product product : products) {
            totalPrice += product.getPrice();
        }
        System.out.println("Total price of products: " +totalPrice);
    }

    public void showPrice() {
        System.out.println("Price of products: ");
        for(Product product : products) {
            System.out.println(product.getName() + ": " + product.getPrice());
        }
    }
}
