package com.compulynx.alex.mobileapptesting;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class settings extends testBase {
    @Test
    public void settingss(){
        driver.findElement(By.id("settings_icon")).click();
        WebElement label1 = driver.findElement(By.id("ip_title"));
        assertEquals("Input your IP address", label1.getText());
        WebElement label2 = driver.findElement(By.id("port_title"));
        assertEquals("Input your Port number", label2.getText());
        WebElement macID = driver.findElement(By.id("deviceid"));
        assertNotNull(macID.getText());
        System.out.println(macID);
        driver.findElement(By.className("android.widget.ImageButton")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //WebElement macID = driver.findElement(By.id("deviceid"));
    }
}

