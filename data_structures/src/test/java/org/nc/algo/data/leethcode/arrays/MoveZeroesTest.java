package org.nc.algo.data.leethcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @ParameterizedTest
    @MethodSource("provideData")
    void moveZeroes(int[] input, int[] expected) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] output = moveZeroes.moveZeroes(input);
        Assertions.assertArrayEquals(output, expected);

    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
//                Arguments.of(new int[]{0,0,1}, new int[]{1, 0, 0}),
                Arguments.of(new int[]{}, new int[]{}),
                Arguments.of(new int[]{ 0, 1, 2, 0, 3, 4}, new int[]{ 1, 2, 3, 4, 0, 0 }),
                Arguments.of(new int[]{ 0, 1, 2, 0, 3, 4, 5, 6, 0, 9}, new int[]{ 1, 2, 3, 4, 5, 6, 9, 0, 0, 0 })
        );
    }
}