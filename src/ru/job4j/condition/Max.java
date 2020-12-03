package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left < right  ? right : left;
        return result;
    }

    public static void main(String[] argss) {
        int result = Max.max(1, 3);
        System.out.println(result);
    }
}
