package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;

public class FirstTest extends WebDriverSettings{
    @Test
    public void firstTest() {
        driver.get("https://www.delivery-club.ru/");
        Assert.assertTrue("Delivery Club — Доставка еды из ресторанов от 25 минут!".equals(driver.getTitle()));
    }
}
