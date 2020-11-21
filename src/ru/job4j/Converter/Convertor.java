package ru.job4j.Converter;

public class Convertor {

    public static int rubleToEuro(int val) {
        return val / 92;

    }

    public static int rubleToDollar(int val){
        return -1;
    }
    public  static void main (String [] args){
        int in = 200;
        int expected = 2;
        int out =  Convertor.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. test result: " + passed);
        int in1 = 300;
        int expexted1 = 4;
        int out1 = Convertor.rubleToDollar(in1);
        boolean res = out1 == expexted1;
        System.out.println("300 rubles are 4 dollars. Test result is " + res);
    }

}
