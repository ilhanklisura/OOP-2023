package week2.labs;

public class Vjezba2 {
    public static void greetManyTimes(String name, int times) {
        int i = 0;
        while (i < times) {
            greet(name);
            i++;
        }
    }
    public static void greet(String name) {
        System.out.println("Hi " + name + ", greetings from the world of methods!");
    }
    public static void main(String[] args) {
        /*
        int number = 1024;
        while (number >= 1) {
            System.out.println(number);
            number = number / 2;
        }

        int result = 0;
        int i = 0;
        while (i < 4) {
            result = result + 3;
            i++; // means the same as i = i + 1;
        }
*/
        greetManyTimes("Ilhan", 3);
        System.out.println("and");
        greetManyTimes("Harun", 2);

    }
}
