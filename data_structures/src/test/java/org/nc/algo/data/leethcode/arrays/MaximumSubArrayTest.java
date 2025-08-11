package org.nc.algo.data.leethcode.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubArrayTest {

    @Test
    public void testMaxSubArray() {
        int[] nums = new int[]{ -2,1,-3,4,-1,2,1,-5,4 };

        MaximumSubArray maximumSubArray = new MaximumSubArray();

        int output = maximumSubArray.maxSubArray(nums);

        assertEquals(output, 6);
    }

}