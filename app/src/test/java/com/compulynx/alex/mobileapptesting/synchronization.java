package com.compulynx.alex.mobileapptesting;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class synchronization extends testBase  {

    @Test
    public void sync() throws Exception {
        String tapMssg,peers, thisDevice,deviceStatus,peerAfter,peerSearch1, peerSearch2,peerFound;
        driver.findElement(By.id("sync_icon")).click();
        thisDevice = driver.findElement(By.id("my_name")).getText();
        deviceStatus = driver.findElement(By.id("my_status")).getText();
        System.out.println("My Device: " +thisDevice + " " +deviceStatus);
        Thread.sleep(20000);
        try{
            peers = driver.findElement(By.id("empty")).getText();
            System.out.println(peers);
            driver.findElement(By.className("android.widget.ImageView")).click();
            driver.findElement(By.id("title")).click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            peerAfter = driver.findElement(By.id("device_name")).getText();
            System.out.println(peerAfter);
            if (Objects.equals(peerAfter, peers)){
                peerSearch1 = driver.findElement(By.id("alertTitle")).getText();
                peerSearch2 = driver.findElement(By.id("message")).getText();
                driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                peerFound = driver.findElement(By.id("empty")).getText();
                System.out.println(peerSearch1+ " " + peerSearch2);
                System.out.println(peerFound);
            }{
                System.out.println("Please check your WIFI connection");
            }}catch (Exception e){
            System.out.println(driver.findElement(By.id("device_name")).getText());
            driver.findElement(By.id("device_name")).click();
            driver.findElement(By.id("btn_connect")).click();
            System.out.println("Waiting for device to Pair...");
            Thread.sleep(20000);
            System.out.println("Connection Declined by Receiving Device");
        }

    }

}

