package ru.job4j.array.sort;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.array.Machine;

public class MachineTest {

    @Test
    public void when50by35() {
        int money = 50;
        int price = 35;
        int[] result = Machine.change(money, price);
        int[] expected = {10, 5};
        Assert.assertArrayEquals(expected, result);

    }
}