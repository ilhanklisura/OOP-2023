package week4.labs;

import week4.labs.enums.FillType;
import week4.labs.people.Person;
import week4.labs.people.Student;
import week4.labs.people.Teacher;
import week4.labs.shapes.Circle;
import week4.labs.shapes.Rectangle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printDepartment(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200));
        people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"));

        printDepartment(people);

        Circle circle = new Circle("Red", FillType.FILLED, 5.0);

        // Display information about the circle
        System.out.println("Circle Information:");
        circle.displayInfo();
        System.out.println();

        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle("Blue", FillType.NOT_FILLED, 4.0, 6.0);

        // Display information about the rectangle
        System.out.println("Rectangle Information:");
        rectangle.displayInfo();

    }
}
