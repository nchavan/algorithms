package org.nc.algo.data.leethcode.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.nc.algo.data.utils.FileReader;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

class GroupAnagramsTest {

    @ParameterizedTest
    @MethodSource("dataProvided")
    void groupAnagramsUsingListToMuchTime(String[] intput, List<List<String>> expected) {
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> output = groupAnagrams.groupAnagrams(intput);
        Assertions.assertThat(output)
                .isEqualTo(expected);
    }

    @Test
    void largeInputGroupAnagramsUsingListToMuchTime() throws IOException {
        String input = new FileReader().readFileFromTestResources("input/anagramsInput1.txt");
        String[] largeInput = input.split(",");

        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> output = groupAnagrams.groupAnagrams(largeInput);
        Assertions.assertThat(output.size())
                .isGreaterThan(9860);
    }

    public static Stream<Arguments> dataProvided() {
        return Stream.of(
                Arguments.of(new String[]{"eat","tea","tan","ate","nat","bat"},
                        List.of(List.of("eat","tea", "ate"), List.of("tan","nat"), List.of("bat"))
                ),
                Arguments.of(new String[]{"ddddddddddg","dgggggggggg"},
                        List.of(List.of("ddddddddddg"), List.of("dgggggggggg"))
                )
        );
    }

}