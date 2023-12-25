package week4.labs.shapes;

import week4.labs.enums.FillType;

public class Shape {
    private String color;
    private FillType filled;

    public Shape(String color, FillType filled) {
        this.color = color;
        this.filled = filled;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Filled: " + filled);
    }

    public double getArea() {
        return 0.0;
    }
}
