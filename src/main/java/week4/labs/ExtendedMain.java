package week4.labs;

import week4.labs.people.ExtendedPerson;
import week4.labs.people.ExtendedStudent;

public class ExtendedMain {
    public static void main(String[] args) {
        ExtendedPerson person = new ExtendedPerson("John Doe", "123 Main Street", 25, "USA");

        System.out.println("ExtendedPerson Information:");
        System.out.println("Name: " + person.getName());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());
        System.out.println();

        ExtendedStudent student = new ExtendedStudent("Alice", "456 Oak Avenue", 20, "Canada", "S12345");

        System.out.println("ExtendedStudent Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Age: " + student.getAge());
        System.out.println("Country: " + student.getCountry());
        System.out.println("Student ID: " + student.getStudentId());

        // Add grades to the student
        student.addGrade(95.0);
        student.addGrade(87.5);

        // Display grades of the student
        System.out.println("Grades: " + student.getGrades());
    }
}

