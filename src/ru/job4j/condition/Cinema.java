package ru.job4j.condition;

public class Cinema {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema");
        } else {
            System.out.println("i can not goo");
        }
    }
        public static void main(String[] args) {
            Cinema.permission(true, true);
            Cinema.permission(true,false);
            Cinema.permission(false, false);
            Cinema.permission(false, true);
        }
    }

