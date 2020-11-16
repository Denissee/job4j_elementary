package ru.job4j.condition;

public class TrgArea {
    public static double area (double a, double b, double c){
        double p = (a+b+c)/2;
        double s1=p-a;
        double s2=p-b;
        double s3=p-c;
        double multy = p*s1*s2*s3;
        double s = Math.sqrt(multy);
        return s;
        }
        public static void main (String []args){
        double res = TrgArea.area(4,4,4);
        System.out.println("area(4;2;8)= "+res);

    }
}
