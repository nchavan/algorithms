package org.nc.algo.data.structures.recursion;

public class ReverseString {

    public String reverse(String str) {
        if(str.length() <= 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }

}
