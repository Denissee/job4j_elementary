package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1); // минимальный элемент в массиве
            int index = FindLoop.indexof(data, min, i, data.length - 1); // индекс минимального элемента в массиве
            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }
return data;
    }
}
