package org.nc.algo.data.structures.recursion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    public static Stream<Arguments> dataProvided() {
        return Stream.of(
                Arguments.of(5, 5)
//                Arguments.of(6, 8),
//                Arguments.of(7, 13)
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvided")
    void fibonacciLinear(int intput, int expected) {
        Fibonacci fibonacci = new Fibonacci();
        int output = fibonacci.fibonacci(intput);
        Assertions.assertThat(output)
                .isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("dataProvided")
    void fibonacciRecur(int intput, int expected) {
        Fibonacci fibonacci = new Fibonacci();
        int output = fibonacci.fibonacciRecursively(intput);
        Assertions.assertThat(output)
                .isEqualTo(expected);
    }
}