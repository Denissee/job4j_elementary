package ru.job4j.condition;

import java.util.Enumeration;

public class LogicNot {

    public static boolean isEven(int num) {

        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !notEven(num);
    }

    public static boolean notPositive(int num) {
        return !notPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return !notEven(num) || !notPositive(num);
    }

    public static void main(String[] args) {
        LogicNot.isEven(10);
        System.out.println("Остаток равен 0");
        LogicNot.isPositive(6);
        System.out.println("Положительное число равно 6");
        LogicNot.notEven(8);
        System.out.println("Отрицательное число равно -8");
        LogicNot.notPositive(7);
        System.out.println("Отрицательное число равно -7");
        LogicNot.notEvenAndPositive(5);
        System.out.println("Отрицательное число равно 5");
        LogicNot.evenOrNotPositive(2);
        System.out.println("Отрицательное число равно 2");

    }
}
