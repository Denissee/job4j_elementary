package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class x2Test {

    @Test
  /*  public void whenA10B9C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected  = 40;
         int rsl = x2.calc(a, b, c, x);
         Assert.assertEquals(expected, rsl);
    } */
    public void theFirst() {
        int a1 = 1, b1 = 1, c1 = 1, x1 = 1;
        int expected1 = 3;
        int rsl1 = x2.calc(a1, b1, c1, x1);
        Assert.assertEquals(expected1, rsl1);

    }

}