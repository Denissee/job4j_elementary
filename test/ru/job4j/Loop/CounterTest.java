package ru.job4j.Loop;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByeEven(0,10);
        int expexcted = 30;
        assertThat(rsl,is(expexcted));
    }
    @Test
    public  void whenSumEvenNumbersFrom3to8() {
        int rsl = Counter.sumByeEven(3, 8);
        int expected = 20;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumEvenNumbersFrom1to1() {
        int rsl = Counter.sumByeEven(1,1);
        int expected = 0;
        assertThat(rsl, is(expected));
    }

}