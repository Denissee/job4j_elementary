package ru.job4j.Loop;

public class Fitness {
    public static int cacl(int ivan, int nik) {
        int month = 0;
        while (nik >= ivan) {
            ivan *= 3;
            nik *= 2;
            month++;
        }
        return month;
    }

}
