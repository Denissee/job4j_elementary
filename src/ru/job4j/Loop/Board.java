package ru.job4j.Loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row <= height; row++) {
            for (int cell = 0; cell <= width; cell++) {
                if (cell % 2 != 0) {
                    System.out.println("X");
                } else {
                    System.out.println(" ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Board.paint(3,3);
        System.out.println(" ");
        Board.paint(4,4);
    }
}
