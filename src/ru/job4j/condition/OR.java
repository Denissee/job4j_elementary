package ru.job4j.condition;

public class OR {
        public static void permission(boolean hasMoney, boolean beFriend) {
            if (hasMoney || beFriend) {
                System.out.println("I can go to the club");
            } else {
                System.out.println("I can not ");
            }
        }
            public static  void main(String[]args) {
                OR.permission(false, false);
                OR.permission(false,true);
                OR.permission(true,true);
                OR.permission(true, false);

            }
    }

