package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third, int all) {
        int wer = second;
        int result = third;
        int res = first;
        int allEq = all;

        if (first > second && first > third) {
            return res;
        }

        if (second > first && second > third) {
            return wer;
        }

        if (third  >  first && third > second) {
            return result;
        }

        if (first >= second && first >= third && second >= third) {
            return  allEq;
        }
        return 0;
    }
    }
