package week3vjezba.labs;

public class Vjezba3 {
    public static void main(String[] args) {
        double number = 4 * alwaysReturnTen() + (alwaysReturnTen() / 2) - 8;
        System.out.println( "calculation total " + number );

        String value = wrongMethod();

        String banana = "banana";
        String cucumber = "cucumber";
        String together = banana + cucumber;
        System.out.println("The length of banana is " + banana.length());
        System.out.println("The length of cucumber is " + cucumber.length());
        System.out.println("The word " + together + " length is " + together.length());

        String word = "Supercalifragilisticexpialidocious";
        System.out.println(word.substring(14));
        System.out.println(word.substring(9,20));
    }

    public static int alwaysReturnTen() {
        return 10;
    }

    public static String wrongMethod() {
        System.out.println("I tell you that I will return a String but I do not!");
        return null;
    }
}
