package org.nc.algo.data.leethcode.hashmaps;

import java.util.HashMap;
import java.util.Map;

//    Longest substring without repeating characters
//    Concepts: sliding window + HashMap
//    Task:
//    Input: "abcabcbb"
//    Output: 3 ("abc")
public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) return 0;

        if  (s.length() == 1) return 1;

        HashMap<String, Integer> map = new HashMap<>();
        String[] strArray = s.split("");

        for (int i = 0; i < strArray.length - 1; i++) {
            String str = strArray[i];
            int j = i + 1;
            while (j <= strArray.length - 1 && !str.contains(strArray[j])) {
                str += strArray[j];
                j++;
            }
            map.put(str, str.length());
        }

        return map.values().stream().max(Integer::compareTo)
                .get();
    }

    public int lengthOfLongestSubstring2(String input) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int right = 0, left = 0; right < input.length(); right++) {
            char c = input.charAt(right);

            if (map.containsKey(c)) {
                // returns the max value out of the 2 values.
                left = Math.max(left, map.get(c) + 1);
            }

            map.put(c, right);
            max = Math.max(max, right - left + 1);

        }
        return max;
    }

}
