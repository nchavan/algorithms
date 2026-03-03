package org.nc.algo.data.interview.prep.styles.one.twopointer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsTest {

    @ParameterizedTest
    @MethodSource("dataProvided")
    void reverseWords(String input, String expectedOutput) {
        ReverseWords reverseWords = new ReverseWords();
        String output = reverseWords.reverseWords(input);
        assertEquals(expectedOutput, output);
    }


    @Test
    void stringMethods() {
        String s = "Hello!How@are#you#12142323";
        String[] arr = s.split(",\\s*");
        String[] arr1 = s.split(("\\W+"));
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static Stream<Arguments> dataProvided() {
        return Stream.of(
                Arguments.of(" Spaces", "Spaces"),
                Arguments.of("   Multiple   Spaces", "Spaces Multiple"),
                Arguments.of("I have 3 cats and 1 dog", "dog 1 and cats 3 have I")
        );
    }
}