package org.nc.algo.data.leethcode.arrays;

public class MoveZeroes {

    public int[] moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                // shift all elements by one and move zero to the end.
                int j = i;
                while (j < nums.length - 1) {
                    nums[j] = nums[j+1];
                    j++;
                }
                nums[nums.length - 1] = 0;
            }
        }

        return nums;
    }

}
