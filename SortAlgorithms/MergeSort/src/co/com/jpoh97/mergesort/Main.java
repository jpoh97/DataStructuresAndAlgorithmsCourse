package co.com.jpoh97.mergesort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArrays = { 20, 35, -15, 7, 55, 1, -22 };

        mergeSort(intArrays, 0, intArrays.length);

        System.out.println(Arrays.toString(intArrays));
    }

    private static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) return;

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) return; // All elements in left array are less than right array

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        /*
        When i have: { 33, 36 }, { 34, 35 }, the temp array result of previous while is { 33, 34, 35 } remaining the last
        element in left array, therefore we'll copy that element in the end of the origin array.
        We copy from origin array to itself
         */
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        // Copy temporal sorted array in origin array
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
