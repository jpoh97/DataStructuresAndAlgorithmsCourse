package co.com.jpoh97.countingsort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray, 1, 10);

        System.out.println(Arrays.toString(intArray));
    }

    private static void countingSort(int[] input, int min, int max) { // Min and max possible value in array

        // For inclusive values. If we have items between 1 (min) and 10 (max) then: 10 (max) - 1 (min) = 9 + 1 = 10
        int[] countArray = new int[(max - min) + 1];

        for (int value : input) {
            // value = 1, input[value] = 5, 5 (input[value]) - 1 (min) = 4
            countArray[value - min]++;
        }

        int indexInputArray = 0;
        for (int valueCountingArray = min; valueCountingArray <= max; valueCountingArray++) {
            while (countArray[valueCountingArray - min] > 0) {
                input[indexInputArray++] = valueCountingArray;
                countArray[valueCountingArray - min]--;
            }
        }
    }
}
