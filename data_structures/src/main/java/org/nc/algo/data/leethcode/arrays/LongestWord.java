package org.nc.algo.data.leethcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestWord {

    public static String longestWord(String sen) {

        Map<Integer, String> word = new HashMap<>();

        for (String s : sen.split(" ")) {
            String letter = s.replaceAll("[^a-zA-Z]", "");

            if (!word.containsKey(letter.length())) {
                word.put(letter.length(), letter);
            }
        }

        return word.entrySet().stream()
                .max(Map.Entry.comparingByKey())
                .map(integerStringEntry -> integerStringEntry.getValue())
                .orElse("");
    }
}
