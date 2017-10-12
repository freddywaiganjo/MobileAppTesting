package com.compulynx.alex.mobileapptesting;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class voidTxn extends testBase{

    @Test
    public void voidTxns() throws Exception {
        driver.findElement(By.id("cancel")).click();
        String voidName,error,errorMssg;
        voidName = driver.findElement(By.id("tap")).getText();
        System.out.println(voidName + " ...");
        Thread.sleep(2000);
        driver.findElement(By.id("void_button")).click();
        Thread.sleep(2000);
        error = driver.findElement(By.id("title_text")).getText();
        errorMssg = driver.findElement(By.id("content_text")).getText();
        driver.findElement(By.id("confirm_button")).click();
        System.out.println(error +" : "+ errorMssg);
        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}

