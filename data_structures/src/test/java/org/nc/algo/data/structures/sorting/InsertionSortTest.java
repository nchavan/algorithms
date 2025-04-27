package org.nc.algo.data.structures.sorting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {


    public static Stream<Arguments> dataProvided() {
        return Stream.of(
                Arguments.of(new int[]{7, 77, 11, 4, 2, 12}, new int[]{2, 4, 7, 11, 12, 77})
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvided")
    void sort(int[] intput, int[] expected) {
        InsertionSort insertionSort = new InsertionSort();
        int[] output = insertionSort.sort(intput);
        Assertions.assertThat(output)
                .containsSequence(expected);
    }
}