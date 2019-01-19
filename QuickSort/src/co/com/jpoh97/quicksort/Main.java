package co.com.jpoh97.quicksort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(Arrays.toString(intArray));
    }

    private static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) return;

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }
}
