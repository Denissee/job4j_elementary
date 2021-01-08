package ru.job4j.Loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortageTest {

    @Test
    public void When1year() {
        int year = Mortage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }

    @Test
    public void when2Year() {
        int year = Mortage.year(100, 120, 50);
        assertThat(year, is(2));
    }
}
