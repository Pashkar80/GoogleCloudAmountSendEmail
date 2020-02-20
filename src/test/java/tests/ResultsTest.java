package tests;

import driver.LocalDriver;
import entity.Order;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.PageCreateEmail;
import steps.CommonSteps;


public class ResultsTest {


    private WebDriver driver;
    private String request = "Google Cloud Platform Pricing Calculator";


    @BeforeTest
    public void initDriver() throws InterruptedException {
        driver = LocalDriver.initWebDriver();
        new PageCreateEmail(driver).openPage();

    }


    @Test
    public void checkAmountEmail() throws InterruptedException {
        CommonSteps steps = new CommonSteps(driver);
        String onGoogle = steps.switchWindow();
        String onEmail = steps.valueAmountEmail();
        Assert.assertEquals(onEmail, onGoogle);

    }

    @AfterTest
    public void stopDriver() {
        LocalDriver.stopWebDriver();
    }
}
