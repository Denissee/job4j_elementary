package ru.job4j.Loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (ChekPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
    }

