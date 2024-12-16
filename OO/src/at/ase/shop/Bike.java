package at.ase.shop;

public class Bike implements Product {
    private String style;
    private String name;

    public Bike(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getStyle() {
        return style;
    }
}
