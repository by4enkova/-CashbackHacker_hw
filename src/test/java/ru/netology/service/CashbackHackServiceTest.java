package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateTheAmount() {
        int amount = 3300;
        int actual = service.remain(amount);
        int expected = 700;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldCalculateTheAmountIfZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
    @Test
    public void shouldCalculateTheAmountAndAdd1() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateTheAmountIf1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}