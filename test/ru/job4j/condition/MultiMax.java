package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third, int all) {
        int result = third;
        int rls = second;
        int res = first;
        int allEq = all;

        if (first > second) {
            if (first > third) {
                return res;
            }
            return 0;
        }
        if (second > first) {
            if (second > third) {
                return rls;
            }
            return 0;
        }
        if (third > first) {
            if (third > second) {
                    return result;
                }
            return 0;
            }
        if (first == second && first == third && second == third) {
            return  allEq;
        }
        return 0;
    }
    }
