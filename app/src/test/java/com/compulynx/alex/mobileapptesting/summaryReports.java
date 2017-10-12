package com.compulynx.alex.mobileapptesting;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class summaryReports extends testBase {


    @Test
    public void summaryReportss() throws Exception {
        driver.findElement(By.id("summary_icon")).click();
        System.out.println(driver.findElement(By.id("title")).getText());
        System.out.println(driver.findElement(By.id("count")).getText());
        System.out.println(driver.findElement(By.id("bid")).getText());
        System.out.println(driver.findElement(By.id("vrs")).getText());
        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

}

