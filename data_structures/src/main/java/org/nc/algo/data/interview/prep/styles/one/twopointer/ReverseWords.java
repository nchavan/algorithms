package org.nc.algo.data.interview.prep.styles.one.twopointer;

public class ReverseWords {

    public static String reverseWords(String sentence) {

        sentence = sentence.strip();
        // Replace this placeholder return statement with your code
        String[] split = sentence.split("\\s+");

        int left = 0;
        int right = split.length - 1;

        while (left < right) {
            String word = split[left];
            split[left] = split[right];
            split[right] = word;

            left++;
            right--;
        }

//        MY INITIAL SOLUTION with O(n)
//        String newString = "";
//        // O(n)
//        for (int i = split.length - 1; i >= 0; i--) {
//            if(!split[i].trim().isEmpty()){
//                newString += split[i] + (i == 0 ? "" : " ");
//            }
//        }
// O(n)
// Space - String[] of n.length + new String.

        // recommended using 2 pointers it will be O(n/2)
        return String.join(" ", split);
    }

    public static String reverseWords1(String sentence) {

        int start = 0;
        int end = sentence.length();

        sentence = sentence.stripLeading();

        return sentence;
    }

}
