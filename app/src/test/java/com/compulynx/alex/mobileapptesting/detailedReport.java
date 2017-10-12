package com.compulynx.alex.mobileapptesting;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;

public class detailedReport extends testBase {

    @Test
    public void detailedRpt() throws Exception {
        String Rptdate;
        driver.findElement(By.id("tdetail_icon")).click();
        try{
            driver.findElement(By.id("pickdate")).click();
            driver.findElement(By.id("ok")).click();
            Rptdate = driver.findElement(By.id("date")).getText();
            assertNotNull(Rptdate);
            try {
            /*System.out.println(driver.findElement(By.name("Product:")).getText());
            System.out.println(driver.findElement(By.name("product_")).getText());
            System.out.println(driver.findElement(By.name("Quantity:")).getText());
            System.out.println(driver.findElement(By.name("quantity_")).getText());
            System.out.println(driver.findElement(By.name("Value:")).getText());
            System.out.println(driver.findElement(By.name("value_")).getText());
            System.out.println(driver.findElement(By.name("value_")).getText());
            System.out.println(driver.findElement(By.name("uom_")).getText());*/
                driver.findElement(By.name("Product:")).getText();
                driver.findElement(By.name("Quantity:")).getText();
                driver.findElement(By.name("Value:")).getText();
                driver.findElement(By.name("product_")).getText();
                driver.findElement(By.name("quantity_")).getText();
                driver.findElement(By.name("value_")).getText();
                driver.findElement(By.name("uom_")).getText();
                driver.findElement(By.className("android.widget.ImageButton")).click();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            }catch (Exception e){
                System.out.println("No Reports Displayed");
                driver.findElement(By.className("android.widget.ImageButton")).click();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            }
        }catch (Exception e){

            //System.out.println("Compas Application Crashed");
        }
    }

}

