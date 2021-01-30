package ru.job4j.Loop;

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = cell == row;
                boolean right = cell + row == size - 1;
                if (left) {
                    System.out.print("O");
                } else if (right) {
                    System.out.print("O");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main (String[] args) {
        Slash.draw(3);
        Slash.draw(5);
    }
}