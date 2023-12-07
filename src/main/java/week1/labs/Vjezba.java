package week1.labs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Vjezba {
    public static void main(String[] args) {

        // Obični print line:

        System.out.println("Naša vježba!");

        // Variables and data types:
        String ime = "Ilhan";
        int broj = 10;
        double decimalniBroj = 1.2;
        boolean tacno = true;

        System.out.println("Ovo je string i on će reći da se zovem " + ime + "!");
        System.out.println("Ovo je broj i on će izbaciti broj " + broj);
        System.out.println("Ovo je decimalni broj i on će izbaciti " + decimalniBroj);
        System.out.println("Ovo je boolean i on će izbaciti da je boolean " + tacno);
        /*
        int prviBroj = 21;
        int drugiBroj = 10;
        int suma = prviBroj + drugiBroj;
        System.out.println(suma);
        */
        int racunanjeZagrada = (1 + 2) * (2 + 2) + 2;
        int racunanjeNemaZagrada = 1 + 2 * 2 + 2 + 2;
        System.out.println(racunanjeZagrada);
        System.out.println(racunanjeNemaZagrada);

        int rezultatCijeliBroj = 3 / 2; // CIJELI BROJ
        System.out.println(rezultatCijeliBroj);

        int numberOne = 3;
        double numberTwo = 2;
        double result = numberOne / numberTwo;
        System.out.println(result);

        Scanner reader = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = reader.nextLine();

        System.out.println("Hi, " + name);

        System.out.print("What is your age: ");
        int age = Integer.parseInt(reader.nextLine());

        System.out.println("Your age is " + age);

        System.out.println("Your name is " + name + " and your age is " + age);

        while(true) {
            System.out.println("I can program!");

            System.out.println("Continue? ('no' to quit)? ");
            String command = reader.nextLine();
            if (command.equals("no")) {
                break;
            }
        }
        System.out.println("Thank you! See you later infinite loop!");

        while(true) {
            System.out.println("Napiši kalkulaciju: (sabiraj, oduzmi, zavrsi) ");
            String kalkulacija = reader.nextLine();
            if (kalkulacija.equals("zavrsi")) {
                break;
            }

            System.out.print("Upiši brojeve: ");
            int prviBroj = Integer.parseInt(reader.nextLine());
            int drugiBroj = Integer.parseInt(reader.nextLine());

            if (kalkulacija.equals("sabiraj")) {
                int sumaBrojeva = prviBroj + drugiBroj;
                System.out.println("Suma dva broja je " + sumaBrojeva);
            } else if (kalkulacija.equals("oduzmi")) {
                int oduzmiBroj = prviBroj - drugiBroj;
                System.out.println("Suma oduzetih brojeva je " + oduzmiBroj);
            } else {
                System.out.println("Nepoznata funkcija!");
            }
        }
        System.out.println("Aj vozdra!");
    }
}
