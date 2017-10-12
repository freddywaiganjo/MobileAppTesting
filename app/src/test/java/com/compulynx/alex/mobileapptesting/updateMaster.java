package com.compulynx.alex.mobileapptesting;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class updateMaster extends testBase {

    @Test
    public void updateMasters() throws Exception {
        driver.findElement(By.id("update_icon")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //Update-Master
        System.out.println("Start Updating Master####");
        driver.findElement(By.id("master")).click();
        try {
            System.out.println(driver.findElement(By.id("content_text")).getText());
            driver.findElement(By.id("confirm_button")).click();
            driver.findElement(By.className("android.widget.ImageView")).click();
            driver.findElement(By.name("Upload Transactions")).click();
            driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
            System.out.println(driver.findElement(By.id("content_text")).getText());
            System.out.println("Check WIFI connection and Try Again####");
            driver.findElement(By.id("confirm_button")).click();
            driver.findElement(By.className("android.widget.ImageButton")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }catch (Exception e) {
            WebElement updateSuccess = driver.findElement(By.id("content_text"));
            String successMessage = updateSuccess.getAttribute("value");
            System.out.println(successMessage);
            driver.findElement(By.id("confirm_button")).click();
            driver.findElement(By.id("inputusername")).sendKeys("chip");
            System.out.println("Username: " + driver.findElement(By.id("inputusername")).getText());
            driver.findElement(By.id("login")).click();
            System.out.println("done");
            driver.findElement(By.id("button1")).click();
            driver.findElement(By.id("button2")).click();
            driver.findElement(By.id("button3")).click();
            driver.findElement(By.id("button4")).click();
            driver.findElement(By.id("buttonOk")).click();
            System.out.println("LoggedIn");
            driver.findElement(By.id("update_icon")).click();
            driver.findElement(By.className("android.widget.ImageButton")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }
    }

}

