package org.nc.algo.data.structures.sorting;

public class SelectionSort {

    public int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < array.length; j++) {

                if (array[minimumIndex] > array[j]) {
                    minimumIndex = j;
                }
            }
            swap(array, i, minimumIndex);
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
