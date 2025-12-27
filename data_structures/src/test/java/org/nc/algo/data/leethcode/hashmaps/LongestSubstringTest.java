package org.nc.algo.data.leethcode.hashmaps;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {

    @ParameterizedTest
    @MethodSource("dataProvided")
    void lengthOfLongestSubstring(String input, int expected) {
        LongestSubstring longestSubstring  = new LongestSubstring();
        assertEquals(expected, longestSubstring.lengthOfLongestSubstring2(input));
    }

    public static Stream<Arguments> dataProvided() {
        return Stream.of(
                Arguments.of("abcabcab", 3),
                Arguments.of("and", 3),
                Arguments.of("aa", 1),
                Arguments.of("a", 1)
        );
    }
}