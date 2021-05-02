package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int nullIndex = i; /* указатель на нулевую ячейку */
                for (int j = i; j < array.length; j++) {
                    if (array[j] != null) {   /* указывает на заполненную ячейку */
                        int notNullIndex = j;
                        String temp = array[notNullIndex];
                        array[notNullIndex] = array[nullIndex];
                        array[nullIndex] = temp;
                    }
                }

            }
            System.out.print(array[i] + " ");
        }
        return array;

    }

    }

