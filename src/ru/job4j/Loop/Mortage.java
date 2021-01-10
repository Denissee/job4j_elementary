package ru.job4j.Loop;

public class Mortage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double x, y, z;
        x = percent / 100;
        while (amount > 0) {
            amount = (percent / 100 * amount + amount) - salary;
           year++;
        }
        return year;
    }
}
