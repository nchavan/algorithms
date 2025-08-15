package org.nc.algo.data.tests;

public class FindMaxTwoValues {

    public int maxValues(int[] values) {
        int firstMaxValue = 0;
        int secondMaxValue = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] > firstMaxValue) {
                secondMaxValue = firstMaxValue;
                firstMaxValue = values[i];
            } else if (values[i] > secondMaxValue) {
                secondMaxValue = values[i];
            }
        }
        return firstMaxValue + secondMaxValue;
    }

}
