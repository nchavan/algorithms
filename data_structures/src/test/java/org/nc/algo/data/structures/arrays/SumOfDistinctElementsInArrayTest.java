package org.nc.algo.data.structures.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDistinctElementsInArrayTest {

    @Test
    void sumDistinctElements() {

        int[] input = new int[]{12, 10, 9, 45, 2, 10, 10, 45,10};
        SumOfDistinctElementsInArray sum = new SumOfDistinctElementsInArray();
        int output = sum.sumDistinctElementsUsing1(input);

        Assertions.assertThat(output)
                .isEqualTo(78);
    }
}