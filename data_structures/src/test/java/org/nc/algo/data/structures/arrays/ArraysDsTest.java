package org.nc.algo.data.structures.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class ArraysDsTest {

    @Test
    public void array_build_idu() {
        ArraysDs arraysDs = new ArraysDs();
        arraysDs.push(10);
        arraysDs.push(20);
        arraysDs.push(30);
        arraysDs.push(40);
        arraysDs.push(50);
        arraysDs.printArray();
        arraysDs.pop();
        arraysDs.printArray();
        arraysDs.delete(1);
        arraysDs.printArray();
        List<Integer> output = arraysDs.getData();

        Assertions.assertThat(output)
                .containsExactlyInAnyOrder(10, 30, 40);

    }

}