package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTestTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals (expected, out, 0.01);
    }
    @Test
    public void when01to02() {
        int expected = 1;
        int x1 = 0, y1 = 1, x2 = 0, y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when42to22() {
        int expected = 4;
        int x1 = 4, y1 = 2, x2 = 0, y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public  void when810to612() {
        float expected = 8.24f ;
        int x1 = 6, y1 = 10, x2 = 4, y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}

