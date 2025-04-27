package org.nc.algo.data.structures.sorting;

public class QuickSort {

    public int[] sort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int pivot = findAndPlacePivotAtRightLocation(array, lowIndex, highIndex);
            sort(array, lowIndex, pivot - 1);
            sort(array, pivot + 1, highIndex);
        }

        return array;
    }

    private int findAndPlacePivotAtRightLocation(int[] array, int lowIndex, int highIndex) {

        int pivot = lowIndex;
        int i = lowIndex;
        int j = highIndex;

        while (i < j ) {
            while (array[i] <= array[pivot] && i <= highIndex) {
                i++;
            }
            while (array[j] > array[pivot] && j >= lowIndex) {
                j--;
            }

            if (i < j) {
                swapValues(array, i, j);
            }
        }

        swapValues(array, lowIndex, j);

        return j;
    }

    private void splitArray(int[] array, int left, int right) {

    }

    private void swapValues(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }


}
