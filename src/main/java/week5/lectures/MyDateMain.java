package week5.lectures;

import week5.lectures.person.MyDate;

public class MyDateMain {
    public static void main(String[] args) {
        MyDate first = new MyDate(24, 12, 2009);
        MyDate second = new MyDate(1, 8, 2011);
        MyDate third = new MyDate(21, 3, 2018);
        MyDate fourth = new MyDate(1, 1, 2023);

        System.out.println(first + " earlier than " + second + " : " + first.earlier(second));
        System.out.println(second + " earlier than " + first + " : " + second.earlier(first));

        System.out.println(second + " earlier than " + third + " : " + second.earlier(third));
        System.out.println(third + " earlier than " + second + " : " + third.earlier(second));

        System.out.println(fourth + " earlier than " + first + " : " + fourth.earlier(first));
        System.out.println(first + " earlier than " + fourth + " : " + first.earlier(fourth));
    }
}
