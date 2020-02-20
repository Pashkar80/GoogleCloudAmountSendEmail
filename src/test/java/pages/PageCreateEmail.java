package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.ParseString;

import javax.naming.OperationNotSupportedException;

/**
 * Created by user on 18.01.2020.
 */
public class PageCreateEmail extends PageObject {

    public PageCreateEmail(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    WebDriverWait wait = new WebDriverWait(driver, 120);

    @Override
    public void openPage() {
        driver.get(" https://10minutemail.com");
    }

    @FindBy (xpath = "//*[@id='mailAddress']")
    private WebElement mailAddress;

    @FindBy(xpath = "//*[@id='ui-id-1']")
    private  WebElement buttonOpenEmail;

    @FindBy(xpath = "//*[@id='mobilepadding']/td/h2")
    private  WebElement valueAmount;

    public String getNameEmail(){
        String name= mailAddress.getAttribute("value");
        return  name;
    }

    public void pushButtonOpenEmail(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonOpenEmail));
        buttonOpenEmail.click();
    }

    public String getAmount(){
        String amount=valueAmount.getText();
        return amount;

    }

}
