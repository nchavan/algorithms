package org.nc.algo.data.tests;

import java.util.Arrays;

public class AlternateSort {

    public int[] maxValues(int[] values) {

        int length = values.length / 2;
        if (values.length % 2 != 0) {
            length += 1;
        }

        int[] result = new int[length];
        int resultIndex = 0;
        Arrays.sort(values);

        for (int i = 0; i < values.length; i = i + 2) {
            result[resultIndex] = values[i];
            resultIndex += 1;
        }

        return result;
    }

}
