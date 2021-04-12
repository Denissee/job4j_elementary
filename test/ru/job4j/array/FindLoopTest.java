package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;



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
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void find3() {
        int[] data = {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexof(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasLength8() {
        int[] data = {34, 23, 45, 23, 96, 2, 16, 3};
        int el = 96;
        int start = 3;
        int finish = 5;
        int result = FindLoop.indexof(data, el, start, finish);
        int expected = 4;
        Assert.assertEquals(result, expected);

    }
    @Test
            public void whenArrayHasLength5Then0() {
    int[] data = new int[] {5, 10, 3};
    int el = 5;
    int result = FindLoop.indexOf(data, el);
    int expected = 0;
    Assert.assertEquals(result, expected);
}
}
