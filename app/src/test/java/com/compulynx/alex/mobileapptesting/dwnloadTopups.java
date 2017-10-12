package com.compulynx.alex.mobileapptesting;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class dwnloadTopups extends testBase {

    @Test
    public void downloadTopupss() throws Exception {
        //Update-Topups
        String warningTitle,warningMssg,alertHead,alertBody;
        System.out.println("Download Topups####");
        //driver.findElement(By.id("update_icon")).click();
        driver.findElement(By.id("topups")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        warningTitle = driver.findElement(By.id("title_text")).getText();
        warningMssg = driver.findElement(By.id("content_text")).getText();
        System.out.println(warningTitle +" : "+ warningMssg);
        driver.findElement(By.id("confirm_button")).click();
        driver.findElement(By.className("android.widget.ImageView")).click();
        driver.findElement(By.name("Upload Transactions")).click();
        Thread.sleep(10000);
        alertBody = driver.findElement(By.id("content_text")).getText();
        System.out.println("Error : "+ alertBody);
        driver.findElement(By.id("confirm_button")).click();
        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

}

