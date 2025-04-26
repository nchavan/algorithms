package org.nc.algo.data.structures.arrays;

import java.util.Stack;

public class ReverseString {

    public String reverseStrUsingByteArray(String input) {
        byte[] bytes = input.getBytes();

        byte[] newByte = new byte[bytes.length];

        for (int i = 0; i < bytes.length; i++) {
            newByte[i] = bytes[bytes.length - i - 1];
        }

        return new String(newByte);
    }

    public String reverseStringUsingStack(String input) {
        Stack<String> stac = new Stack<>();

        String[] split = input.split("");

        for (int i = 0; i < split.length; i++) {
            stac.push(split[i]);
        }

        String reverse = "";
        while (!stac.isEmpty()) {
            reverse += stac.pop();
        }

        return reverse;
    }

    // Time complexity - O(n)
    public String reverseStrMostSimpleWay(String input) {
        String[] str = input.split(""); // 0(n) // Space - array

        String output = "";                     // Space - 1
        for (int i = str.length - 1; i >= 0; i--) { // 0(n)
            output += str[i];
        }

        return output;
    }

}
