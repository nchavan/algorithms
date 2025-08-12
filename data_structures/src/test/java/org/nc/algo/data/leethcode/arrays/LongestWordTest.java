package org.nc.algo.data.leethcode.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class LongestWordTest {

    @ParameterizedTest
    @MethodSource("provideData")
    void longestWord(String input, String expected) {
        LongestWord moveZeroes = new LongestWord();
        String output = moveZeroes.longestWord(input);
        Assertions.assertEquals(output, expected);

    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of("fun&!! time", "time"),
                Arguments.of("I love dogs", "love")
        );
    }
}