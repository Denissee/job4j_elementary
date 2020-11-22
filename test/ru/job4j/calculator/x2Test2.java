package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class x2Test2 {

    @Test
    public void calc() {
        int a = 1, b = 1, c = 0, x = 1;
        int expected = 2;
        int rsl = x2.calc(a, b, c, x);
        Assert.assertEquals(rsl, expected);
    }
}