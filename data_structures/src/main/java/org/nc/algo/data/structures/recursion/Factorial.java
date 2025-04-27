package org.nc.algo.data.structures.recursion;

public class Factorial {

    public int factorial(int n) {
        int num = 1;
        for (int i = n; i >= 1; i--) {
            num = num * i;
        }
        return num;
    }

    public int factorialRecursively(int n) {

        if (n == 1) {
            return 1;
        }

        return n * factorialRecursively(n - 1);
    }

}
