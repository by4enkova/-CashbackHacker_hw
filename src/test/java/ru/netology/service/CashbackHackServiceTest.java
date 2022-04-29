package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateTheAmount() {
        int amount = 3300;
        int actual = service.remain(amount);
        int expected = 700;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCalculateTheAmountIfZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateTheAmountAndAdd1() {
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateTheAmountIf1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

}