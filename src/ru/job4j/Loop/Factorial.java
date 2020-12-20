package ru.job4j.Loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        for (n = 1; n <= 5; n++) {
            result = 1 * 2 * 3 * 4 * 5;
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

