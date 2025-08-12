package org.nc.algo.data.leethcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TwoSumTest {

    @ParameterizedTest
    @MethodSource("provideData")
    void moveZeroesUsingBruteForce(int[] input, int[] expected, int target) {
        TwoSum twoSum = new TwoSum();
        int[] output = twoSum.twoSumBruteForceSearchingForAllPairs(input, target);
        Assertions.assertArrayEquals(output, expected);

    }

    @ParameterizedTest
    @MethodSource("provideData")
    void moveZeroesUsingWhileLoop(int[] input, int[] expected, int target) {
        TwoSum twoSum = new TwoSum();
        int[] output = twoSum.twoSumSearchFasterThenBruteForce(input, target);
        Assertions.assertArrayEquals(output, expected);
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void moveZeroesUsingMapMoreSpace(int[] input, int[] expected, int target) {
        TwoSum twoSum = new TwoSum();
        int[] output = twoSum.twoSum(input, target);
        Assertions.assertArrayEquals(output, expected);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{ 2,7,11,15}, new int[]{ 0, 1}, 9),
                Arguments.of(new int[]{ 3, 2, 4}, new int[]{ 1, 2}, 6),
                Arguments.of(new int[]{ 3, 3}, new int[]{ 0, 1}, 6)
        );
    }
}