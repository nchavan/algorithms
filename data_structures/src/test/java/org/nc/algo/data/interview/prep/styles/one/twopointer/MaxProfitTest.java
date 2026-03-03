package org.nc.algo.data.interview.prep.styles.one.twopointer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {

    @ParameterizedTest
    @MethodSource("dataProvided")
    void maxProfit(int[] input, int expectedOutput) {
        MaxProfit mp = new MaxProfit();
        int output = mp.maxProfitSolution(input);
        assertEquals(expectedOutput, output);
    }

    public static Stream<Arguments> dataProvided() {
        return Stream.of(
                Arguments.of(new int[] {1, 2, 3, 4, 5}, 4),
                Arguments.of(new int[] {1, 2, 3, 4, 9, 5, 7, 8, 1}, 8),
                Arguments.of(new int[] {9, 5, 3, 4, 9, 5, 7, 8, 1}, 6),
                Arguments.of(new int[] {9, 5, 3, 4, 9, 2, 5, 7, 9, 1}, 7)
        );
    }
}