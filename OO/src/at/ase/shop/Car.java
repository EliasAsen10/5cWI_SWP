package at.ase.shop;

public class Car implements Product {
    private String color;
    private String name;
    private double price;

    public Car(String color, String name, double price) {
        this.color = color;
        this.name = name;
        this.price = 25000.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }   
    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }
}
