package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
   @Test
    void ifAmountLessThenBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(expected, actual);
    }

    @Test
    void ifAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

    @Test
   void ifAmountIsLimitValues() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(999);

        assertEquals(expected, actual);
    }

    @Test
   void ifAmountMoreThenLimitValues() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(expected, actual);
    }
}