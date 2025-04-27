package org.nc.algo.data.structures.sorting;

public class MergeSort {

    public int[] sort(int[] array) {

        if (array.length == 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        sort(left);
        sort(right);

        return mergeArrays(left, right);
    }

    private int[] mergeArrays(int[] left, int[] right) {
        return left;
    }

}
