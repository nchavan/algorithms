package org.nc.algo.data.structures.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class MergeSort {

    public int[] sort(int[] array) {

        if (array.length == 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOf(array, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        return mergeArrays(sort(left), sort(right));
    }

    private int[] mergeArrays(int[] left, int[] right) {

        int[] merged = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k] = left[i];
                i++;
            } else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            merged[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            merged[k] = right[j];
            j++;
            k++;
        }

        return merged;
    }

}
