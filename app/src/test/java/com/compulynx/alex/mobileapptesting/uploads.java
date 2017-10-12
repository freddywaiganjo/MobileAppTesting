package com.compulynx.alex.mobileapptesting;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class uploads extends testBase {

    @Test
    public void upload()  throws Exception {
        Thread.sleep(2000);
        driver.findElement(By.className("android.widget.ImageView")).click();
        driver.findElement(By.name("Upload Transactions")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.findElement(By.id("content_text")).getText());
        driver.findElement(By.id("confirm_button")).click();
        driver.findElement(By.className("android.widget.ImageView")).click();
        driver.findElement(By.name("Upload Topup Logs")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.findElement(By.id("content_text")).getText());
        driver.findElement(By.id("confirm_button")).click();
        driver.findElement(By.className("android.widget.ImageView")).click();
        driver.findElement(By.name("Upload Archive transactions")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.findElement(By.id("content_text")).getText());
        //WebDriverWait wait = new WebDriverWait(WebDriver driver,long timeOutInSeconds);
        //static ExpectedConditions<WebElement>.elementToBeClickable(By.id("confirm_button"))
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("confirm_button")));
        driver.findElement(By.id("confirm_button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }

}

