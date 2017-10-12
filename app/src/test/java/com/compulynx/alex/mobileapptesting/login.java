package com.compulynx.alex.mobileapptesting;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class login extends testBase{
    @Test
    public void loginn(){
        driver.findElement(By.id("inputusername")).sendKeys("chip");
        driver.navigate().back();
        String usrname;
        usrname = driver.findElement(By.id("inputusername")).getText();
        System.out.println("Username: " +driver.findElement(By.id("inputusername")).getText());
        driver.findElement(By.id("login")).click();
        System.out.println("Login Successful####");
        driver.findElement(By.id("button1")).click();
        driver.findElement(By.id("button2")).click();
        driver.findElement(By.id("button3")).click();
        driver.findElement(By.id("button4")).click();
        driver.findElement(By.id("buttonOk")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}

