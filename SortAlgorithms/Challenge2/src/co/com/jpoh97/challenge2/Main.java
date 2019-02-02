package co.com.jpoh97.challenge2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        insertionSort(intArray, intArray.length);

        System.out.println(Arrays.toString(intArray));

    }

    private static void insertionSort(int[] input, int numItems) {

        if (numItems <= 1) return;

        insertionSort(input, numItems - 1);

        int newElement = input[numItems - 1];
        int i;

        for (i = numItems - 1; i > 0 && input[i - 1] > newElement; i--) { // For descending order replace input[i - 1] > newElement to <
            input[i] = input[i - 1];
        }

        input[i] = newElement;
    }
}
