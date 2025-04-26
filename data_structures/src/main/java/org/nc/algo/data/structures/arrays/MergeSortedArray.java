package org.nc.algo.data.structures.arrays;

public class MergeSortedArray {

    public int[] mergeSortedArray(int[] array1, int[] array2) {

        if (array2 == null && array1 == null) return new int[]{};
        if (array1 == null) return array2;
        if (array2 == null) return array1;

        int[] mergeArrays = new int[array1.length + array2.length];
        int index1 = 0, index2 = 0, index = 0;

        while (index1 < array1.length && index2 < array2.length) {
            if (array1[index1] < array2[index2]) {
                mergeArrays[index] = array1[index1];
                index++;
                index1++;
            } else {
                mergeArrays[index] = array2[index2];
                index++;
                index2++;
            }
        }

        while (index1 < array1.length) {
            mergeArrays[index] = array1[index1];
            index++;
            index1++;
        }

        while (index2 < array2.length) {
            mergeArrays[index] = array2[index2];
            index++;
            index2++;
        }

        return mergeArrays;
    }

}
