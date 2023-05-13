package ru.netology.service;

public class CashbackHackServiceTest {

    // 1) Тест, когда сумма меньше границы

    @org.testng.annotations.Test
    public void testRemainWithAmountLessThanBoundary() {
        int amount = 500;
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }

    // 2) Тест, когда сумма равна границе

    @org.testng.annotations.Test
    public void testRemainWithAmountEqualToBoundary() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }

    // 3) Тест, когда сумма больше границы

    @org.testng.annotations.Test
    public void testRemainWithAmountGreaterThanBoundary() {
        int amount = 1500;
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int actual = service.remain(amount);
        org.testng.Assert.assertEquals(actual, expected);
    }
}