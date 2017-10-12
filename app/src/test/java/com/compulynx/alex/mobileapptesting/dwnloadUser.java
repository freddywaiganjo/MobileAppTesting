package com.compulynx.alex.mobileapptesting;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class dwnloadUser extends testBase{

    @Test
    public void downloadUser() throws Exception {
        //Start Download User
        driver.findElement(By.id("inputusername")).sendKeys("admin");
        System.out.println("Username: " +driver.findElement(By.id("inputusername")).getText());
        driver.findElement(By.className("android.widget.Button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("button1")).click();
        driver.findElement(By.id("button2")).click();
        driver.findElement(By.id("button3")).click();
        driver.findElement(By.id("button4")).click();
        driver.findElement(By.id("buttonOk")).click();
        driver.findElement(By.id("ip")).click();
        driver.findElement(By.className("android.widget.EditText")).sendKeys("138.197.69.156");
        Thread.sleep(3000);
        driver.findElement(By.id("buttonDefaultPositive")).click();
        driver.findElement(By.id("port")).click();
        driver.findElement(By.className("android.widget.EditText")).sendKeys("8087");
        Thread.sleep(3000);
        driver.findElement(By.id("buttonDefaultPositive")).click();
        driver.findElement(By.id("next")).click();
        //driver.findElement(By.xpath("com.evoucher.compas.evoucher:id/text0"));
        //driver.findElement(By.id("confirm_button")).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //End Download User
    }

}

