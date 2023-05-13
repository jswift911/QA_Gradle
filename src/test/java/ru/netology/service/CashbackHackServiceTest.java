package ru.netology.service;

public class CashbackHackServiceTest {

    // 1) Тест, когда сумма меньше границы

    @org.junit.Test
    public void testRemainWithAmountLessThanBoundarJunit4() {
        int amount = 500;
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testRemainWithAmountLessThanBoundaryJupiter() {
        int amount = 500;
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    // 2) Тест, когда сумма равна границе

    @org.junit.Test
    public void testRemainWithAmountEqualToBoundaryJunit4() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testRemainWithAmountEqualToBoundaryJupiter() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    // 3) Тест, когда сумма больше границы

    @org.junit.Test
    public void testRemainWithAmountGreaterThanBoundaryJunit4() {
        int amount = 1500;
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testRemainWithAmountGreaterThanBoundaryJupiter() {
        int amount = 1500;
        CashbackHackService service = new CashbackHackService();
        int expected = 500;
        int actual = service.remain(amount);
        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
}