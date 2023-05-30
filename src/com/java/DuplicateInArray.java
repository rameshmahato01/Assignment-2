package com.java;

public class DuplicateInArray {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};

        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        System.out.println("Duplicates in the array:");

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != -1) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        System.out.println(array[i]);
                        array[j] = -1;
                    }
                }
            }
        }
    }
}

