package ru.job4j.Loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int month = Fitness.cacl(95,90);
        assertThat(month, is(0));
    }
    @Test
    public void whenIvanLessByNik() {
        int month = Fitness.cacl(90,95);
        assertThat(month, is(1));
    }
    @Test
    public void whenIvanLessByFewNik() {
        int month = Fitness.cacl(50, 90);
        assertThat(month, is(2));
    }
}
