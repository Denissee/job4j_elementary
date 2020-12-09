package ru.job4j.condition;

public class MultiMax {

    public static int maxSecond(int first, int second, int third) {
        int result = second;
        if (second > first) {
            if (second > third) {
                return result;
            }
        }
        return 0;
    }

    public static  int maxFirst(int first, int second, int third) {
        int res = first;
        if (first > second) {
            if (first > third) {
                return  res;
            }
        }
        return  0;
    }

    public static int maxThird(int firs, int second, int third) {
        int result = third;
        if (third > second) {
            if (third > firs) {
                return result;
            }
        }
        return 0;
    }

}



