package org.nc.algo.data.interview.prep.styles.twopointer;

//Statement - Given an array, colors, which contains a combination of the following three elements:
// 0 (Representing red)
// 1 (Representing white)
// 2 (Representing blue)
// Sort the array in place so that the elements of the same color are adjacent, and the final order is: red (0), then white (1), and then blue (2).
// Note: You are not allowed to use any built-in sorting functions. The goal is to solve this efficiently without extra space.

public class SortColoursThreePointerTechnique {

    public static int[] sortColors(int[] colours) {
     int start = 0;
     int current = 0;
     int end = colours.length - 1;

     while (current <= end) {

         if (colours[current] == 0) {
                int temp = colours[start];
                colours[start] = colours[current];
                colours[current] = temp;

                start++;
                current++;
         } else if(colours[current] == 1) {
            current++;
         }

         else {
             int temp = colours[current];
             colours[current] = colours[end];
             colours[end] = temp;
             end--;
         }
     }

     return colours;

    }
}
