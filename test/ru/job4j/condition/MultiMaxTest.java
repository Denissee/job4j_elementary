package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.maxSecond(1,4,2);
        assertThat(result, is(4));
    }


    @Test
public void WhenFirstMax() {
    int res = MultiMax.maxFirst(4, 2, 1);
    assertThat(res, is(4));
    }

    @Test
    public void  WhenThirdMax() {
        int result = MultiMax.maxThird(2,1,4);
        assertThat(result, is(4));
    }
}