package week1.labs;

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {

        // First Example:

        System.out.println("Ilhan Klisura");
        System.out.println("Hello World!");
        System.out.println("(And all the people of the world!)");

        // Second Example:

        int seconds = 60;
        int minutes = 60;
        int hours = 24;
        int days = 365;

        int secondsYear = seconds * minutes * hours * days;

        System.out.println("There are " + secondsYear + " seconds in year.");

        // Third Example:
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int prviBroj = Integer.parseInt(reader.nextLine());

        System.out.println("Type a second number: ");
        int drugiBroj = Integer.parseInt(reader.nextLine());

        int suma = prviBroj + drugiBroj;

        System.out.println("The sum of two numbers is " + suma);

        // Fourth Question:
        System.out.println("Enter number: ");
        int broj = Integer.parseInt(reader.nextLine());

        if (broj > 0) {
            System.out.println("Number is positive.");
        } else if (broj == 0) {
            System.out.println("Number is zero.");
        } else {
            System.out.println("Number is negative.");
        }

        // Fifth Question:
        System.out.println("Enter first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Enter second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        if (firstNumber > secondNumber){
            System.out.println("The first number is greater than second number.");
        } else if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The second number is greater than first number.");
        }
    }
}