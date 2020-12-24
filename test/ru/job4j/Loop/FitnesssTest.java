package ru.job4j.Loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnesssTest {

    @Test
    public void calc() {
        @Test
        public void voidIvanGreatNik() {
            int month = Fitnesss.calc(95, 90);
            assertThat(month, is(0));
        }

        @Test
        public void whenIvanLessByOneNik() {
            int month = Fitnesss.calc(90, 95);
            assertThat(month, is(1));
        }
        @Test
        public void whenIvanLessByFewNik() {
            int month = Fitnesss.calc(50, 90);
            assertThat(month, is(2));
        }
    }
}
