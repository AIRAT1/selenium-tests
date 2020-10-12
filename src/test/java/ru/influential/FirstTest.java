package ru.influential;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.deliveryClub.WebDriverSettings;

public class FirstTest extends WebDriverSettings {
    @Test
    public void firstTest() {
        driver.get("https://mail.ru/");
        Assert.assertTrue("Mail.ru: почта, поиск в интернете, новости, игры".equals(driver.getTitle()));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mailbox:submit-button")));

        driver.findElement(By.id("mailbox:login-input")).sendKeys("ayrat1@mail.ru");
        driver.findElement(By.cssSelector("button")).click();
        driver.findElement(By.id("mailbox:password-input")).sendKeys("Top Secret");
        driver.findElement(By.cssSelector("button")).click();
    }

    @Test
    public void fail() {
        driver.get("https://mail.ru/");
        Assert.assertTrue("Mail.ru: почта, поиск в интернете, новости, игры".equals(driver.getTitle()));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mailbox:submit-button")));
        driver.findElement(By.cssSelector("button")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mailbox:error")));
        WebElement element = driver.findElement(By.id("mailbox:error"));
//        WebElement parent = element.findElement(By.xpath(".."));

        Assert.assertTrue("Введите имя ящика".equals(element.getText()));
        Assert.assertEquals("Введите имя ящика", element.getText());
        driver.quit();
    }
}
