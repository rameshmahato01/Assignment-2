package com.java;
import java.util.Arrays;
public class SubsetOfAnotherArray {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 7, 8, 5, 9};
        int[] array2 = {2, 4, 6};

        boolean isSubset = isSubsetArray(array1, array2);

        if (isSubset) {
            System.out.println("array2 is a subset of array1");
        } else {
            System.out.println("array2 is not a subset of array1");
        }
    }

    public static boolean isSubsetArray(int[] array1, int[] array2) {
        // Sort both arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        int i = 0, j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                i++;
            } else if (array1[i] == array2[j]) {
                i++;
                j++;
            } else {
                return false; // array2 element not found in array1
            }
        }

        if (j == array2.length) {
            return true; // array2 elements found in array1
        } else {
            return false; // array2 elements not found in array1
        }
    }
}
