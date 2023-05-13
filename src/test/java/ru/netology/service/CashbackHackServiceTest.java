package ru.netology.service;

public class CashbackHackServiceTest {

    // 1) Тест, когда сумма меньше границы

    @org.junit.Test
    public void testRemainWithAmountLessThanBoundary() {
        int amount = 500;
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }

    // 2) Тест, когда сумма равна границе

    @org.junit.Test
    public void testRemainWithAmountEqualToBoundary() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }

    // 3) Тест, когда сумма больше границы

    @org.junit.Test
    public void testRemainWithAmountGreaterThanBoundary() {
        int amount = 1500;
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }
}