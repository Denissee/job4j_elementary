package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] massive = new int[5];
        for (int index = 0; index < massive.length; index++) {
            massive[index] = index * 2 + 3;
        }
        for (int index = 0; index < massive.length; index++) {
            System.out.println(massive[index]);
        }
    }
}