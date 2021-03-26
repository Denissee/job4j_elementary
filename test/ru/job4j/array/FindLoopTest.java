package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(result, expected);

    }
    @Test
    public void WhenArrayHas7Then2() {
        int[] data = {34, 12, -75, 4, 96, 25, -2};
        int el = -75;
        int result = FindLoop.indexOf(data, el);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void WhenArrayDoesntFindAnyNum() {
        int[] data = {2, 6, 85, 41, 62, -41};
        int el = 1;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
}