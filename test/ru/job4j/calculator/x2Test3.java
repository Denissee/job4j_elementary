package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class x2Test3 {

    @Test
    public void calc() {
        int a, b, c, x;
        a = 1; b = 1; c = 1; x = 0;
        int expected = 1;
        int rsl = x2.calc(a, b, c, x);
        Assert.assertEquals(rsl, expected);
    }
}