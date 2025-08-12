package org.nc.algo.data.leethcode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> list = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (list.containsKey(nums[i])) {
                return true;
            }
            list.put(nums[i], 1);
        }

        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        boolean duplicate = false;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                duplicate = true;
                return true;
            }
            list.add(nums[i]);
        }

        return duplicate;
    }

}
