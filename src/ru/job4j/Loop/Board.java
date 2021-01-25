package ru.job4j.Loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if ((cell + row) % 2 == 0) {
                    System.out.print("X");
                }
                }
                System.out.print(" ");
            }
        }

        public static void main(String[] args) {
            paint(3, 3);
            System.out.println(" ");
            paint(4, 4);
        }
    }




