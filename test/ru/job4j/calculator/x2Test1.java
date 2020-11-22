package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class x2Test1 {

    @Test
    public void calc() {
        int a2 = 0, b2 = 1, c2 = 1, x2 = 1;
        int expected2 = 2;
        int rsl2 = ru.job4j.calculator.x2.calc(a2, b2, c2, x2);
        Assert.assertEquals(expected2, rsl2);
    }
}