package com.compulynx.alex.mobileapptesting;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.testng.annotations.AfterSuite;

import static com.compulynx.alex.mobileapptesting.testBase.driver;

/**
 * Created by Chirchir on 9/26/2017.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        //dwnloadUser.class,
        login.class,
        uploads.class,
        settings.class,
        updateMaster.class,
        dwnloadCardHolders.class,
        dwnloadTopups.class,
        transactions.class,
        xReport.class,
        summaryReports.class,
        detailedReport.class,
        formatCard.class,
        cardActivate.class,
        voidTxn.class,
        synchronization.class,
        chngPword.class,
})
public class main {
    @AfterSuite
    public  static void tearDownApp(){
        System.out.println("Closing application");
        driver.quit();
    }
}