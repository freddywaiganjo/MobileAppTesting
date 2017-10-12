package com.compulynx.alex.mobileapptesting;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

@SuppressWarnings("deprecation")
public class dwnloadCardHolders extends testBase {

    @Test
    public void dwnloadBeneficiariess() throws Exception {
        //Update-CardHolders
        driver.findElement(By.id("update_icon")).click();
        driver.findElement(By.id("ben")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.findElement(By.id("content_text")).getText());
        driver.findElement(By.id("confirm_button")).click();
        //driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);    }

}

