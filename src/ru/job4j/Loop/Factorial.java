package ru.job4j.Loop;

public class Factorial {
    public static int calc(int n) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
           return  result;
    }
}
     /*   int i = 1;
        do {
            i = i * n;
            i++;
        } while (i <= n);
    }
    return i;
} */