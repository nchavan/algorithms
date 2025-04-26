package org.nc.algo.data.structures.hastable;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRecurringCharacter {

    public int findFirstCharacter(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int recurring = 0;

        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) != null) {
                recurring = array[i];
                break;
            }
            map.put(array[i], 0);
        }

        return recurring;
    }
}
