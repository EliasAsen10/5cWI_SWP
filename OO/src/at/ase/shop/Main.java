package at.ase.shop;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("red", "Audi");
        Car c2 = new Car("blue", "BMW");
        Car c3 = new Car("green", "Mercedes");
        Car c4 = new Car("yellow", "Volkswagen");
        Bike b1 = new Bike("Mountain", "BMX");
        Bike b2 = new Bike("Road", "Trek");
        Bike b3 = new Bike("Hybrid", "Giant");
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
