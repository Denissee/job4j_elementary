package ru.job4j.Loop;

public class ChekPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int i = 1; i == number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return true;
    }
}





