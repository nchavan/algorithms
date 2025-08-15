package org.nc.algo.data.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AlternateSortTest {

    @ParameterizedTest
    @MethodSource("provideData")
    void maxValues(int[] input, int[] expected) {
        AlternateSort sort = new AlternateSort();

        int[] output = sort.maxValues(input);

        Assertions.assertArrayEquals(output, expected);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, new int[]{1, 3, 5}),
                Arguments.of(new int[]{1, 4, 5, 8, 12, 111}, new int[]{1, 5, 12})
        );
    }
}