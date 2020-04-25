package tests;

import driver.DriverSingleton;
import driver.LocalDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.PageCreateEmail;
import steps.CommonSteps;


public class ResultsTest {


    private WebDriver driver;



    @BeforeTest
    public void initDriver()  {
        driver = LocalDriver.initWebDriver();
       //driver = DriverSingleton.getDriver();
        new PageCreateEmail(driver).openPage();

    }


    @Test
    public void checkAmountEmail()  {
        CommonSteps steps = new CommonSteps(driver);
        String onGoogleForm = steps.getAmountFromGoogleForm();
        String onEmail = steps.valueAmountEmail();
        Assert.assertEquals(onEmail,onGoogleForm);

    }

    @AfterTest
    public void stopDriver() {

      LocalDriver.stopWebDriver();
     //   DriverSingleton.closeDriver();
    }
}
