package com.java;

public class BubbleSort {
	public static void main(String[] args) {
        int[] array = {5,7,2,4,3,9,6,8,1};

        System.out.println("Array before sort:");
        printArray(array);

        bubbleSort(array);

        System.out.println("array after sorting:");
        printArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements and swap if necessary
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


