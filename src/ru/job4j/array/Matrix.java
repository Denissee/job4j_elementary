package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] box = new int[size][size];
        for (int row = 0; row < box.length; row++) {
            for (int cell = 0; cell < box[row].length; cell++) {
                box[row][cell] = (row + 1) * (cell + 1);

            }
        }
        return box;
    }
}

