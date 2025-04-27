package org.nc.algo.data.structures.recursion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.nc.algo.data.structures.sorting.BubbleSort;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    public static Stream<Arguments> dataProvided() {
        return Stream.of(
                Arguments.of(5, 120)
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvided")
    void factorialRec(int intput, int expected) {
        Factorial factorial = new Factorial();
        int output = factorial.factorialRecursively(intput);
        Assertions.assertThat(output)
                .isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("dataProvided")
    void factorial(int intput, int expected) {
        Factorial factorial = new Factorial();
        int output = factorial.factorial(intput);
        Assertions.assertThat(output)
                .isEqualTo(expected);
    }
}