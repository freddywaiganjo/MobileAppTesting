package com.compulynx.alex.mobileapptesting;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class xReport extends testBase {

    @Test
    public void xReports() throws Exception {
        //driver.swipe(64,generateY(driver.scrollTo("yugiui"))).click();
        driver.findElement(By.id("xreports_icon")).click();
        System.out.println(driver.findElement(By.id("title")).getText());
        System.out.println(driver.findElement(By.id("count")).getText());
        System.out.println(driver.findElement(By.id("vcount")).getText());
        System.out.println(driver.findElement(By.id("samt")).getText());
        System.out.println(driver.findElement(By.id("vamt")).getText());
        System.out.println(driver.findElement(By.id("nsales")).getText());
        driver.findElement(By.id("printxreport")).click();
        System.out.println(driver.findElement(By.id("content_text")).getText());
        driver.findElement(By.id("confirm_button")).click();
        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}

