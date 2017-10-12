package com.compulynx.alex.mobileapptesting;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;

public class transactions extends testBase {
    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void transactionss() throws Exception {

        String blockTitle, blockMsg,printTitle,printMsg,print,printCancel,Qty1,Qty2,cash1,cash2;
        int valueA, valueB,totalAll, totalAmount,item1Total,item1Qty,item1Cash,item2Qty,item2cash,item2Total;
        driver.findElement(By.id("txns_icon")).click();
        driver.findElement(By.id("tap"));
        System.out.println("Tap card to Purchase");
        Thread.sleep(3000);
        System.out.println("Card tapped##");
        try {
            //driver.findElement(By.name("Reading the card"));
            //System.out.println(driver.findElement(By.name("Reading the card")).getText());
            driver.findElement(By.id("button1")).click();
            driver.findElement(By.id("button2")).click();
            driver.findElement(By.id("button3")).click();
            driver.findElement(By.id("button4")).click();
            driver.findElement(By.id("buttonOk")).click();
            String programm;
            programm = driver.findElement(By.name("TBC Food Programme")).getText();
            collector.checkThat(programm, equalTo("TBC Food Programme"));
            driver.findElement(By.id("main")).click();
            System.out.println(programm);
            String voucher;
            voucher = driver.findElement(By.name("Food")).getText();
            collector.checkThat(voucher, equalTo("Food"));
            driver.findElement(By.id("main")).click();
            System.out.println(voucher);
            String bal;
            bal =driver.findElement(By.id("val")).getText();
            Assert.assertNotNull(bal);
            System.out.println("Card Balance Found = " +bal);
            //Product1
            String cashQ1, cashQ2, qty1, qty2;
            driver.findElement(By.name("ဟီ(မ်)မၣ်လံၣ်(jasmine rice)")).click();
            driver.findElement(By.id("mySpinner")).click();
            driver.findElement(By.name("1.0-KGs")).click();
            driver.findElement(By.id("cash")).sendKeys("5");
            driver.findElement(By.id("qty")).sendKeys("2");
            Qty1=driver.findElement(By.id("cash")).getText();
            cash1=driver.findElement(By.id("qty")).getText();
            driver.findElement(By.name("Purchase")).click();
            System.out.println("item one added to cart ");
            item1Qty = Integer.valueOf(Qty1);
            item1Cash = Integer.valueOf(cash1);
            item1Total = item1Qty *item1Cash;
            System.out.println(item1Total);
            //Product2
            driver.findElement(By.name("ပအံ(Sticky rice)")).click();
            driver.findElement(By.id("mySpinner")).click();
            driver.findElement(By.name("0.5-KGs")).click();
            driver.findElement(By.id("cash")).sendKeys("10");
            driver.findElement(By.id("qty")).sendKeys("2");
            Thread.sleep(2000);
            cash2=driver.findElement(By.id("cash")).getText();
            Qty2=driver.findElement(By.id("qty")).getText();
            driver.findElement(By.id("buttonDefaultPositive")).click();
            System.out.println("item two added to cart ");
            item2Qty = Integer.valueOf(Qty2);
            item2cash = Integer.valueOf(cash2);
            item2Total = item2Qty * item2cash;
            totalAll = item1Total + item2Total;
            System.out.println(item2Total);
            System.out.println(totalAll);
            assertEquals(totalAll, item1Total + item2Total);
            // driver.findElement(By.id("confirm_button")).click();
            driver.findElement(By.id("floating_action_button")).click();
            //totalAmount= driver.findElement(By.name("Total amount: THB 30.0")).getText();
            driver.findElement(By.id("submit")).click();
            //printTitle = driver.findElement(By.id("title")).getText();
            //printMsg = driver.findElement(By.id("content")).getText();
            //System.out.println(printTitle+ " , " +printMsg);
            Thread.sleep(5000);
            //blockTitle = driver.findElement(By.id("title_text")).getText();
            // blockMsg = driver.findElement(By.id("content_text")).getText();
            System.out.println(driver.findElement(By.id("content_text")).getText());
            driver.findElement(By.id("confirm_button")).click();
            //System.out.println(blockTitle +" : "+ blockMsg);
            driver.findElement(By.className("android.widget.ImageButton")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        }catch (Exception e){

            print = driver.findElement(By.id("buttonDefaultPositive")).getText();
            System.out.println(print+ "?");
            driver.findElement(By.id("buttonDefaultPositive")).click();
            System.out.println(driver.findElement(By.name("Printing")).getText());
            System.out.println(driver.findElement(By.name("Please wait")).getText());
            Thread.sleep(5000);
            System.out.println(driver.findElement(By.id("title_text")).getText());
            System.out.println(driver.findElement(By.id("content_text")).getText());
            driver.findElement(By.id("confirm_button")).click();
            driver.findElement(By.className("android.widget.ImageButton")).click();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


                /*printCancel = driver.findElement(By.name("CANCEL")).getText();
                System.out.println(printCancel+ " ?");
                driver.findElement(By.name("CANCEL")).click();
                System.out.println("Printing Canceled");*/


        }
    }

}

