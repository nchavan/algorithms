package org.nc.algo.data.structures.hastable;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class FindFirstRecurringCharacterTest {

    @ParameterizedTest
    @MethodSource("provideData")
    public void testRecu(int[] input, int expected) {
        FindFirstRecurringCharacter recurringCharacter = new FindFirstRecurringCharacter();
        int output = recurringCharacter.findFirstCharacter(input);
        Assertions.assertThat(output)
                .isEqualTo(expected);
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 5, 7, 3}, 3),
                Arguments.of(new int[]{1, 2, 1, 3, 5, 7, 3}, 1)
        );
    }

}