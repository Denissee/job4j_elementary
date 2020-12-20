package ru.job4j.Loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int res = Factorial.calc(5);
        int expected = 120;
        assertThat(res, is(expected));
    }
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int res = Factorial.calc2(0);
        int expected = 1;
        assertThat(res, is(expected));
    }
}