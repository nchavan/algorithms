package org.nc.algo.data.structures.sorting;

public class InsertionSort {

    public int[] sort(int[] array) {

        int i = 0;
        int j = 0;

        while (j < array.length - 1) {
            j = j + 1;
            i = j - 1;

            if (array[i] > array[j]) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

            while (i > 0 && array[i] < array[i - 1]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i--;
            }
        }
        return array;
    }

}
