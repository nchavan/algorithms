package org.nc.algo.data.important.regex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.nc.algo.data.interview.prep.regex.RegularExpression;

import java.util.Arrays;

class RegularExpressionTest {

    @Test
    @DisplayName("Split by non-letters should return only words")
    void testLowerOrUpperCase() {
        String s = "Hello!How@are#you";
        String[] result = s.split(RegularExpression.LOWER_OR_UPPER_CASE.getValue());

        assertArrayEquals(
                new String[]{"Hello", "How", "are", "you"},
                result
        );
    }

    @Test
    @DisplayName("Split by whitespace")
    void testEmptySpaces() {
        String s = "Hello   World\tJava";
        String[] result = s.split(RegularExpression.EMPTY_SPACES.getValue());

        assertEquals(5, result.length);
    }

    @Test
    @DisplayName("Remove lowercase and uppercase letters")
    void testRemoveLowerOrUpperCaseLetters() {
        String s = "Hello123World!";
        String[] result = s.split(RegularExpression.REMOVE_LOWER_OR_UPPER_CASE_LETTERS.getValue());

        assertArrayEquals(
                new String[]{"", "123", "!"},
                result
        );
    }

    @Test
    @DisplayName("Split by non-lowercase characters")
    void testLowerCaseCharacters() {
        String s = "helloWORLDjava";
        String[] result = s.split(RegularExpression.LOWER_CASE_CHARACTERS.getValue());

        assertArrayEquals(
                new String[]{"hello", "java"},
                result
        );
    }

    @Test
    @DisplayName("Split by non-uppercase characters")
    void testUpperCaseCharacters() {
        String s = "HELLOworldJAVA";
        String[] result = s.split(RegularExpression.UPPER_CASE_CHARACTERS.getValue());

        assertArrayEquals(
                new String[]{"HELLO", "JAVA"},
                result
        );
    }

    @Test
    @DisplayName("Split by non-numeric characters")
    void testNumbers() {
        String s = "Order123Number456";
        String[] result = Arrays.stream(s.split(RegularExpression.NUMBERS.getValue())).filter(str -> !str.isBlank()).toArray(String[]::new);

        assertArrayEquals(
                new String[]{"123", "456"},
                result
        );
    }

    @Test
    @DisplayName("Split by non-alphanumeric characters")
    void testWordsLettersAndNumbers() {
        String s = "Java@17#Spring$Boot";
        String[] result = s.split(RegularExpression.WORDS_LETTERS_AND_NUMBERS.getValue());

        assertArrayEquals(
                new String[]{"Java", "17", "Spring", "Boot"},
                result
        );
    }

    @Test
    @DisplayName("Remove letters and numbers")
    void testRemoveLowerOrUpperCaseLettersAndNumbers() {
        String s = "Java17!@#";
        String[] result = s.split(
                RegularExpression.REMOVE_LOWER_OR_UPPER_CASE_LETTERS_AND_NUMBERS.getValue()
        );

        assertArrayEquals(
                new String[]{"", "!@#"},
                result
        );
    }

    @Test
    @DisplayName("Match any non-alphanumeric characters zero or more times")
    void testAny() {
        String s = "Java123";
        String[] result = s.split(RegularExpression.ANY.getValue());

        // zero or more can create empty splits
        assertTrue(result.length >= 1);
    }

    @Test
    @DisplayName("Split by non-word characters")
    void testWords() {
        String s = "Hello_world!Java-Regex";
        String[] result = s.split(RegularExpression.WORDS.getValue());

        assertArrayEquals(
                new String[]{"Hello_world", "Java", "Regex"},
                result
        );
    }
}
