package ru.job4j.Loop;

public class Fitnes {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (nik >= ivan) {
            ivan = ivan * 3;
            nik = nik * 2;
            month++;
        }
        return month;
    }
}
