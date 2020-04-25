package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * Created by user on 18.01.2020.
 */
public class PageCreateEmail extends PageObject {

    public PageCreateEmail(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    WebDriverWait wait = new WebDriverWait(driver, 120);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Override
    public void openPage() {
        driver.get(" https://10minutemail.net");
    }


    @FindBy (xpath = "//*[@id='fe_text']")
    private WebElement mailAddress;


    @FindBy(linkText ="Google Cloud Platform Price Estimate" )
    private  WebElement buttonOpenEmail;

    @FindBy(xpath = "//tbody/tr[2]/td[2]/h3")
    private  WebElement valueAmount;

   public String getNameEmail(){
        String name= mailAddress.getAttribute("value");
        return  name;
   }



    public void pushButtonOpenEmail(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonOpenEmail));
        buttonOpenEmail.click();
      //  js.executeScript("arguments[0].click()",buttonOpenEmail);
    }

    public String getAmount(){
        String amount=valueAmount.getText();
        return amount;

    }

}
