package org.nc.algo.data.structures.arrays;

/**
 * https://leetcode.com/problems/rotate-array/description/
 */
public class RotateArray {

    public int[] rotateArrayWithNoExtraMemory(int[] nums, int k) {
        int arrayLength = nums.length - 1;
        int p = 0;

        // rotate one element of the array
        while (p < k) {
            int last = nums[arrayLength];
            for (int i = arrayLength; i > 0; i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = last;
            p++;
        }

        return nums;
    }

    public int[] rotateArray(int[] nums, int k) {

        int[] arrFinal = new int[nums.length];
        int arrayLength = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            int index = i + k;
            if (index > arrayLength) {
                index = index - arrayLength - 1;
            }
            arrFinal[index] =  nums[i];
        }

        return arrFinal;
    }

}
