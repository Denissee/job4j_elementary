package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int wer = MultiMax.max(1,4,2,0);
        assertThat(wer, is(4));
    }
    @Test
public void WhenFirstMax() {
    int res = MultiMax.max(4, 2, 1, 0);
    assertThat(res, is(4));
    }

    @Test
    public void  WhenThirdMax() {
        int result = MultiMax.max(2,1,4, 0);
        assertThat(result, is(4));
    }
    @Test
    public  void WhenAllIsEqual() {
        int allEq = MultiMax.max(4,4,4,4);
        assertThat(allEq, is(4) );
    }
}