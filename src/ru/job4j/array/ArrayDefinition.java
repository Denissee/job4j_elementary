package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
       /* short[] ages = new short[10];
        String[] surnames = new String[1005000];
        float[] prices = new float[40];
        System.out.println("Размер массива равен:" + ages.length);
        System.out.println("Размер массива равен:" + surnames.length);
        System.out.println("Размер массива равен: " + prices.length); */

        String[] names = new String[4];
        names[0] = "Denis Zainullin,";
        names[1] = " Roger Federer,";
        names[2] = " Red Hot Chilli Pepers,";
        names[3] = " The monster of men";
        System.out.println(names[0] + names[1] + names[2] + names[3]);

    }
}