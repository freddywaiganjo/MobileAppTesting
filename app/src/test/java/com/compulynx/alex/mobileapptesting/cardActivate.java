package com.compulynx.alex.mobileapptesting;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class cardActivate extends testBase{

    @Test
    public void cardActivation() throws Exception {
        String errorTitle, errorMssg,username,idNo,cardNo,activationMssg, successtitle, successMsg,
                invalidTitle,invalidMssg,tapAgainTitle,tapAgainMssg;
        driver.findElement(By.id("activation_icon")).click();
        driver.findElement(By.id("submitcode")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        try {
            username = driver.findElement(By.id("name")).getText();
            cardNo = driver.findElement(By.id("idno")).getText();
            idNo = driver.findElement(By.id("cardno")).getText();
            System.out.println(username);
            System.out.println(idNo);
            System.out.println(cardNo);
            driver.findElement(By.id("activate_card")).click();
            activationMssg = driver.findElement(By.id("title")).getText();
            System.out.println(activationMssg);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            try{
                successtitle = driver.findElement(By.id("title_text")).getText();
                successMsg = driver.findElement(By.id("content_text")).getText();
                System.out.println(successtitle + ": " + successMsg);
                driver.findElement(By.id("confirm_button")).click();
                driver.findElement(By.className("android.widget.ImageButton")).click();
                driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            }catch (Exception e){
                String notSuccessful = "Card not successfully activated.Please tap card and wait";
                tapAgainTitle = driver.findElement(By.id("title_text")).getText();
                tapAgainMssg = driver.findElement(By.id("content_text")).getText();
                System.out.println(tapAgainTitle + ": " + tapAgainMssg);
                driver.findElement(By.id("confirm_button")).click();
                    /*do {
                        driver.findElement(By.id("confirm_button")).click();

                    }while (!tapAgainMssg.equals(notSuccessful));*/
            }
            driver.findElement(By.id("activate_card")).click();

        }catch (Exception e){
            invalidTitle = driver.findElement(By.id("title_text")).getText();
            invalidMssg = driver.findElement(By.id("content_text")).getText();
            System.out.println(invalidTitle+ "! " +invalidMssg);
            driver.findElement(By.id("confirm_button")).click();
        }
    }
}

