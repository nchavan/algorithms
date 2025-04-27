package org.nc.algo.data.structures.sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class QuickSortTest {
    public static Stream<Arguments> dataProvided() {
        return Stream.of(
                Arguments.of(new int[]{11, 4, 2, 7, 12, 77}, new int[]{2, 4, 7, 11, 12, 77})
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvided")
    void sort(int[] intput, int[] expected) {
        QuickSort quickSort = new QuickSort();
        int[] output = quickSort.sort(intput, 0, intput.length - 1);
        Assertions.assertThat(output)
                .containsSequence(expected);
    }
}