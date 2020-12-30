package ru.job4j.Loop;

public class ChekPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                prime = true;
                break;
            }
        }
        return prime;
    }
}





