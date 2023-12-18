package week2.labs;

import java.util.Scanner;

public class Labs2 {
    public static void main(String[] args) {
/*
        // Pravi password:
        String tacanPassword = "ilhanharun";

        // Očitavanje:
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the password: ");
        String ukucajPassword = reader.nextLine();

        if (ukucajPassword.equals(tacanPassword)) {
            System.out.println("This is correct password!");
            System.out.println("The secret is: jryy qbar!");
        } else {
            System.out.println("Not correct! Try again!");
        }

        int sum = 0;
        int read;

        for (read = 1; read <= 3; read++) {
            System.out.println("Enter the number " + read + ": ");
            int number = reader.nextInt();
            sum += number; // number + number + number
        }

        System.out.println("Sum: " + sum);

        int sum = 0;
        while (true) {
            System.out.print("Enter number: ");
            int read = reader.nextInt();
            if (read == 0) {
                break;
            }
            sum += read;
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);


        System.out.println("Enter first number: ");
        int prviBroj = reader.nextInt();

        System.out.println("Enter second number: ");
        int drugiBroj = reader.nextInt();

        if (prviBroj > drugiBroj) {
            System.out.println("It cannot combine numbers.");
        } else {
            System.out.println("The numbers between " + prviBroj + " and " + drugiBroj + " are: ");
            while (prviBroj <= drugiBroj) {
                System.out.println(prviBroj);
                prviBroj++;
            }
        }

        System.out.println("Type a number: ");
        int broj = reader.nextInt();
        int read;

        int sum = 0;
        for (read = 0; read <= broj; read++) {
            int number = (int)Math.pow(2, read);
            sum += number; // number * number * number
        }
        System.out.println("The sum is: " + sum);

 */
        printText();

        printStars(5);
        printStars(3);
        printStars(9);

        System.out.println();

        drawStarsPyramid(5);
        drawStarsPyramid(10);

        System.out.println();

        drawInvertedPyramid(5);
        drawInvertedPyramid(10);

        System.out.println();

        drawNumbersPyramid(5);
        drawNumbersPyramid(10);

        NumberGuessingGame();
    }

    // Make me a program where you can guess a number between 1 and 100.
    // The program should ask for a number until the user guesses the correct number.
    // For each guess the program should tell if the number is bigger or smaller than the guessed number.
    // When the user guesses the correct number the program should print how many guesses were made.

    public static void NumberGuessingGame() {
        Scanner reader = new Scanner(System.in);
        int number = 42;
        int guess;
        int guesses = 0;

        while (true) {
            System.out.println("Guess a number: ");
            guess = reader.nextInt();
            guesses++;

            if (guess == number) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (guess < number) {
                System.out.println("The number is greater, guess again!");
            } else {
                System.out.println("The number is smaller, guess again!");
            }
        }
        System.out.println("You guessed the number in " + guesses + " guesses.");
    }

    // Make a program that has 4 methods:
    // 1. Method that prints stars
    // 2. Method that prints text
    // 3. Method that prints stars pyramid
    // 4. Method that prints inverted pyramid
    // 5. Method that prints numbers pyramid

    public static void drawInvertedPyramid(int rowsInverted) {
        int i;
        int j;
        int stars;
        for (i = rowsInverted; i >= 1; --i) {
            for (j = 1; j <= i; ++j) {
                System.out.print("");
            }
            for (stars = 1; stars <= i; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawNumbersPyramid(int rowsNumbers) {
        int i;
        int j;
        for (i = 1; i <= rowsNumbers; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public static void drawStarsPyramid(int rows) {
        int i;
        int j;
        int stars;
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= rows - i; j++){
                System.out.print("");
            }
            for (stars = 1; stars <= i; stars++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printStars(int amount) {
        int zvjezdice;
        for (zvjezdice = 0; zvjezdice < amount; zvjezdice++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
