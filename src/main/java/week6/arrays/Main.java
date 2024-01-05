package week6.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Test smallest method
        int[] values = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + ArrayManipulation.smallest(values));

        // Test indexOfTheSmallest method
        int[] values2 = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest: " + ArrayManipulation.indexOfTheSmallest(values2));

        // Test indexOfTheSmallestStartingFrom method
        int[] values3 = {-1, 6, 9, 8, 12};
        System.out.println("Index of the smallest starting from 1: " + ArrayManipulation.indexOfTheSmallestStartingFrom(values3, 1));
        System.out.println("Index of the smallest starting from 2: " + ArrayManipulation.indexOfTheSmallestStartingFrom(values3, 2));
        System.out.println("Index of the smallest starting from 4: " + ArrayManipulation.indexOfTheSmallestStartingFrom(values3, 4));

        // Test swap method
        int[] values4 = {3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(values4));
        ArrayManipulation.swap(values4, 1, 0);
        System.out.println(Arrays.toString(values4));
        ArrayManipulation.swap(values4, 0, 3);
        System.out.println(Arrays.toString(values4));

        // Test binary search
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        int searchedValue = 8;
        System.out.println("Value " + searchedValue + " is in the array: " + BinarySearch.search(array, searchedValue));

        // Test printElegantly
        int[] arrayToPrint = {5, 1, 3, 4, 2};
        ArrayManipulation.printElegantly(arrayToPrint);
    }
}

