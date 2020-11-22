package ru.job4j.Converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertorTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 200;
        int expected = 2;
        int out = Convertor.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180Rblto3Dlr() {
int in = 400;
int expected = 5;
int out = Convertor.rubleToDollar(in);
Assert.assertEquals(expected, out);
    }
}