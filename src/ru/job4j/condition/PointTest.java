package ru.job4j.condition;

public class PointTest {
    public static double distance (int x1, int y1, int x2, int y2){
        double a = x2 - x1;
        double b = y2 - y1;
        double first = Math.pow(a, 2);
        double second = Math.pow(b, 2);
        double summ = first + second;
        double fnl = Math.sqrt(summ);
        return fnl;
    }
    public static void main (String[] args){
        double result = distance(0,0,2,0);
        System.out.println("Расстояние между двумя точками равно "+result);
    }
}
