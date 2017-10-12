package com.compulynx.alex.mobileapptesting;

import org.junit.Test;
import org.openqa.selenium.By;

public class chngPword extends testBase{

    @Test
    public void chngePword() throws Exception {
        String succss, successmssg;
        driver.findElement(By.id("inputusername")).sendKeys("chip");
        System.out.println("Username: " +driver.findElement(By.id("inputusername")).getText());
        driver.findElement(By.id("login")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("button1")).click();
        driver.findElement(By.id("button2")).click();
        driver.findElement(By.id("button3")).click();
        driver.findElement(By.id("button4")).click();
        driver.findElement(By.id("buttonOk")).click();
        System.out.println("Login Success");
        driver.findElement(By.id("passchange_icon")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("name")).click();
        String usrName;
        usrName = driver.findElement(By.id("name")).getText();
        System.out.println("Change Password " +usrName);
        driver.findElement(By.id("input_password1")).sendKeys("1234");
        driver.findElement(By.id("input_password2")).sendKeys("1234");
        Thread.sleep(2000);
        driver.findElement(By.id("change")).click();
        Thread.sleep(2000);
        succss = driver.findElement(By.id("title_text")).getText();
        successmssg = driver.findElement(By.id("content_text")).getText();
        driver.findElement(By.id("confirm_button")).click();
        System.out.println(succss +" : "+ successmssg);
        System.out.println("Password Changed");
    }

}

