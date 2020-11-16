package ru.job4j;

public class Fit {
    public static double manWeight (short mheight){
        double rsl = (mheight - 100) * 1.15;
        return rsl;
    }
    public static double womenWeight (short height){
        double rsl = (height - 110)*1.15;
        return  rsl;
    }
    public static void main (String [] args){
       short mheight = 172;
       double man = manWeight(mheight);
        System.out.println("Идеальный вес для мужчины составит "+man+"кг.");
        short height= 165;
       double women = Fit.womenWeight(height);
       System.out.println("Идеальный вес для женщины составит "+women+"кг.");
    }
}
