package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public  void whenExist() {
        boolean result = Triangle.exist(2,2,2);
        assertThat(result, is(true));

    }
    @Test
    public void whenDontExist () {
        boolean result = Triangle.exist(2,3,1);
        assertThat(result, is(false));
    }

}