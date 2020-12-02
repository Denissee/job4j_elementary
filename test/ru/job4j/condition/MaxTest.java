package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax3To1Then3() {
        int result = Max.max(3, 1);
        assertThat(result, is(3));
    }
    @Test
    public void whenMin1To3() {
        int result = Max.max(1, 3);
        assertThat(result, is(3));
    }
    @Test
    public void when3To3() {
        int result = Max.max(3, 3);
        assertThat(result, is(3));
    }
}
