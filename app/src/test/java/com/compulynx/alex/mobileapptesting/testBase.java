package com.compulynx.alex.mobileapptesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class testBase {

    public static  WebDriver driver;
    public  static AndroidDriver<MobileElement>androidDriver;

    static {
// set up appium
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "Sony");
            //capabilities.setCapability("udid", "RQ30012SLE");
            capabilities.setCapability("udid", "RQ3001KCLM");
            //capabilities.setCapability("udid", "VGNRIRYSPBKBDUSO");
            capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
            capabilities.setCapability(CapabilityType.VERSION, "6.0");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "com.evoucher.compas.evoucher");
            capabilities.setCapability("appActivity", "com.evoucher.compas.evoucher.UsernameActivity");
            capabilities.setCapability("noReset", "true");
            driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }catch (Exception e){
            System.out.println(e);

        }
    }
   /* @AfterSuite
    public void tearDownAppium() {
        System.out.println("Successful######");
         driver.quit();
    }*/
}