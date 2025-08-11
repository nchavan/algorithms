package org.nc.algo.data.structures.arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayTest {

    @ParameterizedTest
    @MethodSource("provideData")
    void rotateArray(int[] input, int[] expectedOutput, int rotate) {
        RotateArray rotateArray = new RotateArray();
        int[] output = rotateArray.rotateArrayWithNoExtraMemory(input, rotate);

        assertArrayEquals(output, expectedOutput);


    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{1, 4, 5, 8, 12, 111}, new int[]{ 111, 1, 4, 5, 8, 12 }, 1),
                Arguments.of(new int[]{1, 4, 5, 8, 12, 111}, new int[]{ 12, 111, 1, 4, 5, 8 }, 2),
                Arguments.of(new int[]{1, 4, 5, 8, 12, 111}, new int[]{ 8, 12, 111, 1, 4, 5 }, 3),
                Arguments.of(new int[]{1, 4, 5, 8, 12, 111}, new int[]{ 5, 8, 12, 111, 1, 4 }, 4)
        );
    }
}