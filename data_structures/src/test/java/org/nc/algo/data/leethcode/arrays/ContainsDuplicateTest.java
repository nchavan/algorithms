package org.nc.algo.data.leethcode.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    @Test
    void containsDuplicate() {
        int[] input = new int[]{ 1,2,3,1};
        ContainsDuplicate duplicate = new ContainsDuplicate();
        boolean output = duplicate.containsDuplicate(input);
        Assertions.assertThat(output).isTrue();

    }
}