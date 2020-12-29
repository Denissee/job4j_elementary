package ru.job4j.Loop;

public class ChekPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        int temp;
        int num = 0;
        for (int i = 1; i <= number / 2; i++) {
            num = number % i;
            if (num == 0) {
                prime = true;
                break;
            }
        }
        return prime;
    }
}





