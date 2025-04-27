package org.nc.algo.data.structures.recursion;

public class Fibonacci {

    public int fibonacci(int n) {
        int i = 0;
        int j = 1;
        int k = 0;
        for (int l = 2; l <= n; l++) {
            k = i + j;
            i = j;
            j = k;
        }
        return k;
    }

    public int fibonacciRecursively(int intput) {

        if (intput == 1 || intput == 2) {
            return 1;
        }
        System.out.println(intput);
        return fibonacciRecursively(intput - 1)
                + fibonacciRecursively(intput - 2);

    }
}
