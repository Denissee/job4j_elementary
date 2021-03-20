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
        return !(num % 2 == 0);
    }

    public static boolean notPositive(int num) {
        return !(num > 0);
    }

    public static boolean notEvenAndPositive(int num) {
        return !(num % 2 == 0) && !(num < 0);
    }

    public static boolean evenOrNotPositive(int num) {
        return !(num % 3 == 0) || !(num > 0);
    }

    public static void main(String[] args) {
        LogicNot.isEven(10);
        System.out.println("Остаток равен 0");
        LogicNot.isPositive(6);
        System.out.println("Положительное число равно 6");
        LogicNot.notEven(7);
        System.out.println("число 7 не положительное число");
        LogicNot.notPositive(-7);
        System.out.println("Отрицательное число равно -7");
        LogicNot.notEvenAndPositive(5);
        System.out.println("Число 5 нечетное и положительное");
        LogicNot.evenOrNotPositive(-3);
        System.out.println(" Число -3 лишь не положительное");

    }
}
