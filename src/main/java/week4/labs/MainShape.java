package week4.labs;

import week4.labs.enums.FillType;
import week4.labs.shapes.Circle;
import week4.labs.shapes.Rectangle;

public class MainShape {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", FillType.FILLED, 5.0);
        Rectangle rectangle = new Rectangle("Blue", FillType.NOT_FILLED, 4.0, 6.0);

        System.out.println("Circle Information:");
        circle.displayInfo();
        System.out.println();

        System.out.println("Rectangle Information:");
        rectangle.displayInfo();
    }
}

