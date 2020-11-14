package ru.job4j;

public class Convertor {

    public static int RubleToEuro (int val){
        int res = val / 92;
        return res;
    }

    public  static int RubleToDollars (int val){
        int res = val / 70;
        return res;
    }
    public  static float RubToCNY (int val){
        float res = val / 11.5f;
        return  res;

    }
    public static void main (String[] args){
        int euro = RubleToEuro(200);
        System.out.println("The 120 rubles are "+euro+ " euros");
        int doll = RubleToDollars(350);
        System.out.println("The 350 rubles are "+doll+" dollars");
        float CNY = RubToCNY((int) 457.3f);
        System.out.println("The 481 rubles are "+CNY+" uans");

    }
}
