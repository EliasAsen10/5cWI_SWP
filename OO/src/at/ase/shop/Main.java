package at.ase.shop;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("red", "Audi", 25000.0);
        Car c2 = new Car("blue", "BMW", 30000.0);
        Car c3 = new Car("green", "Mercedes", 35000.0);
        Car c4 = new Car("yellow", "Volkswagen", 20000.0);
        Bike b1 = new Bike("Mountain", "Giant", 500.0);
        Bike b2 = new Bike("Road", "Trek", 700.0);
        Bike b3 = new Bike("Hybrid", "Cannondale", 600.0);
        Gui gui = new Gui();
        gui.addProduct(c1);
        gui.addProduct(c2);
        gui.addProduct(c3);
        gui.addProduct(c4);
        gui.addProduct(b1);
        gui.addProduct(b2);
        gui.addProduct(b3);
        gui.run();  
    }       
}
