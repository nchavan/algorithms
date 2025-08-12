package org.nc.algo.data.leethcode.arrays;

import java.util.*;

/**
 * https://leetcode.com/problems/maximum-subarray/description/
 */
public class MaximumSubArray {

    public int maxSubArray(int[] nums) {
        List<Integer> maxSub = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            int elementTotal = nums[i];
            maxSub.add(elementTotal);
            j++;
            while (j < nums.length & nums.length >= 1) {
                elementTotal += nums[j];
                maxSub.add(elementTotal);
                j++;
            }
        }
        return Collections.max(maxSub);
    }

    public int maxSubArrayUsingLoops(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int internalNumber = 0;
            for (int j = i; j < nums.length; j++) {
                internalNumber += nums[j];
                if (max < internalNumber) {
                    max = internalNumber;
                }
            }
        }
        return max;
    }

}
