package org.nc.algo.data.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FindMaxTwoValuesTest {

    @ParameterizedTest
    @MethodSource("provideData")
    void maxValues(int[] input, int expectedValue) {
        FindMaxTwoValues findMaxTwoValues = new FindMaxTwoValues();
        int output = findMaxTwoValues.maxValues(input);
        Assertions.assertEquals(output, expectedValue);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 9),
                Arguments.of(new int[]{1, 4, 5, 8, 12, 111}, 123)
        );
    }
}