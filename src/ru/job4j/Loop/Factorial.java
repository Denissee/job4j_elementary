package ru.job4j.Loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        int res = 1;
        for (;   1 <= n; n++) {
            result = res * n;
        }
        return result;
    }

    public static int calc2(int n) {
        int result = 1;
        for (n = 1; n <= 1; n++) {
            return result;
        }
        return result;
    }
}

