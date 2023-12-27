package week4.labs;

import week4.labs.people.ExtendedPerson;
import week4.labs.people.ExtendedStudent;
import week4.labs.people.Person;
import week4.labs.people.Student;
import week4.labs.people.Teacher;

import java.util.ArrayList;
import java.util.List;

public class ExtendedMain {
    public static void printDepartment(List<Person> people) {
        for (Person person : people) {
            System.out.println(person);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200));
        people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki", "S12345"));

        // ExtendedPerson and ExtendedStudent examples
        people.add(new ExtendedPerson("John Doe", "123 Main St", 30, "USA"));
        people.add(new ExtendedStudent("Alice", "456 Oak Ave", 20, "Canada", "S67890"));

        // Add grades to the ExtendedStudent
        ExtendedStudent extendedStudent = (ExtendedStudent) people.get(3);
        extendedStudent.addGrade(95.0);
        extendedStudent.addGrade(87.5);

        printDepartment(people);
    }
}


