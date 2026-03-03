package org.nc.algo.data.interview.prep.styles.one.twopointer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SortColoursThreePointerTechniqueTest {

    @MethodSource("dataProvided")
    @ParameterizedTest
    void sortColors(int[] input, int[]  expected) {
        SortColoursThreePointerTechnique sortColoursThreePointerTechnique = new SortColoursThreePointerTechnique();
        int[] output = sortColoursThreePointerTechnique.sortColors(input);

        assertArrayEquals(expected, output);
    }

    public static Stream<Arguments> dataProvided() {
        return Stream.of(
//                Arguments.of(new int[] {0, 1, 0}, new int[] {0, 0, 1}),
//                Arguments.of(new int[] {1, 1, 0, 2}, new int[] {0, 1, 1, 2}),
//                Arguments.of(new int[] {2, 1, 1, 0, 0}, new int[] {0, 0, 1, 1, 2}),
//                Arguments.of(new int[] {2, 2, 2, 0, 1, 0}, new int[] {0, 0, 1, 2, 2, 2}),
                Arguments.of(new int[] {2, 1, 1, 0, 1, 0, 2}, new int[] {0, 0, 1, 1, 1, 2, 2})
        );
    }
}