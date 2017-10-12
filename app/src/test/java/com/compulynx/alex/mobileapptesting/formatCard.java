package com.compulynx.alex.mobileapptesting;

import org.junit.Test;
import org.openqa.selenium.By;

public class formatCard extends testBase {

    @Test
    public void fmtCard() throws Exception {
        driver.findElement(By.id("inputusername")).sendKeys("chip");
        System.out.println("Username: " +driver.findElement(By.id("inputusername")).getText());
        driver.findElement(By.id("login")).click();
        System.out.println("Login Success");
        Thread.sleep(3000);
        driver.findElement(By.id("button1")).click();
        driver.findElement(By.id("button2")).click();
        driver.findElement(By.id("button3")).click();
        driver.findElement(By.id("button4")).click();
        driver.findElement(By.id("buttonOk")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("format_icon")).click();
        String tapMssg,succss, successmssg;
        try {
            tapMssg = driver.findElement(By.id("tapcard")).getText();
            System.out.println(tapMssg + " ...");
        } catch (Exception e){
            System.out.println("Exception: Format card hint delayed");
        }
        Thread.sleep(2000);
        succss = driver.findElement(By.id("title_text")).getText();
        successmssg = driver.findElement(By.id("content_text")).getText();
        driver.findElement(By.id("confirm_button")).click();
        System.out.println(succss +" : "+ successmssg);
    }

}

