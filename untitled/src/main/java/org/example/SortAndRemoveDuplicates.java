package org.example;

import java.util.Arrays;

public class SortAndRemoveDuplicates {
    public static int[] sortAndRemoveDuplicates(int[] input) {

        for (int i = 0; i < input.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
        }


        int uniqueCount = 1;
        for (int i = 1; i < input.length; i++) {
            if (input[i] != input[i - 1]) {
                input[uniqueCount] = input[i];
                uniqueCount++;
            }
        }


        return Arrays.copyOf(input, uniqueCount);
    }

    public static void main(String[] args) {
        int[] input = {5, 3, 8, 3, 9, 1, 5};
        int[] result = sortAndRemoveDuplicates(input);
        System.out.println(Arrays.toString(result));
    }
}