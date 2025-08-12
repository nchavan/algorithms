package org.nc.algo.data.leethcode.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        while (i < nums.length) {
            int expectedValue = target - nums[i];

            if (map.containsKey(expectedValue)) {
                return new int[]{map.get(expectedValue), i};
            }

            map.put(nums[i], i);
            i++;
        }

        return new int[]{};
    }

    public int[] twoSumSearchFasterThenBruteForce(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int checkInArray = target - nums[i];
            int j = i + 1;
            while (j < nums.length) {
                if (checkInArray == nums[j]) {
                    return new int[]{i, j};
                }
                j++;
            }
        }

        return new int[]{};
    }

    public int[] twoSumBruteForceSearchingForAllPairs(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

}
