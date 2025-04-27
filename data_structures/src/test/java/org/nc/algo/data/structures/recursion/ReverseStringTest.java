package org.nc.algo.data.structures.recursion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.nc.algo.data.structures.recursion.ReverseString;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    public static Stream<Arguments> dataProvided() {
        return Stream.of(
                Arguments.of("Hello", "olleH"),
                Arguments.of("and", "dna"),
                Arguments.of("aa", "aa"),
                Arguments.of("a", "a"),
                Arguments.of("", "")
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvided")
    void reverse(String intput, String expected) {
        ReverseString reverseString = new ReverseString();
        String output = reverseString.reverse(intput);
        Assertions.assertThat(output)
                .isEqualTo(expected);
    }
}