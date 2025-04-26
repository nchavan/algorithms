package org.nc.algo.data.structures.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class ReverseStringTest {

    @ParameterizedTest
    @MethodSource("provideStringsForIsBlank")
    public void reverseStringUsingStackMostSimpleWay(String input, String expected) {
        ReverseString reverseString = new ReverseString();

        String output = reverseString.reverseStrUsingByteArray(input);

        Assertions.assertThat(output)
                .isEqualTo(expected);
    }

    private static Stream<Arguments> provideStringsForIsBlank() {
        return Stream.of(
                Arguments.of("123", "321"),
                Arguments.of("hell", "lleh")
        );
    }
}