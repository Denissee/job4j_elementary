package ru.job4j.Loop;

public class Mortage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double x, y, z;
        x = percent / 100;
        z = amount;
        while (z > 0) {
            z = ((x * z) + z) - salary;
           year++;
        }
        return year;
    }
}
