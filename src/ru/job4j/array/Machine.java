package ru.job4j.array;
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int cup = money - price;
        if (cup > 0) {
        for (int coin : coins) {
            while (cup - coin >= 0) {
                rsl[size] = coin;
                size++;
                cup -= coin; // cup = cup - coins[i]
            }
        }
        }
        return Arrays.copyOf(rsl, size);
    }
}
