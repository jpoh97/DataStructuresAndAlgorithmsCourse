package co.com.jpoh97.sortingarrayusingjdk;

import java.util.Arrays;

public class Main {

    /*
    If we can use the counting or radix sort, it's better.
     */

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Use a variation of quicksort called DualPivotQuicksort. Prevent the worst case of quicksort.
        Arrays.sort(intArray);

        // It's a parallel sort-merge. Use the Arrays.sort. Require a working space no greater than the size of the original array.
        // It's using threads and that's why it's called parallel sort.
        // Recommended for large dataset cuz it might be faster sort.
        Arrays.parallelSort(intArray);

        System.out.println(Arrays.toString(intArray));
    }
}
