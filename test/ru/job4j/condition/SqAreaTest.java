package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void sqarea() {
        int expected = 2;
        int k = 6;
        int p = 2;
        double out = SqArea.sqarea(k, p);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void second() {
        int expected = 0;
        int k = 8;
        int p = 4;
        double out = SqArea.sqarea(k, p);
        Assert.assertEquals(expected, out, 0.01);
    }
}