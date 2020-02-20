package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by user on 10.11.2019.
 */
public class PageOfResultsEnterData extends PageObject {


    public PageOfResultsEnterData(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public void openPage() {


    }
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(xpath = "//*[@id='compute']//div[@class='md-list-item-text ng-binding'and contains(text(),'VM class:')]")
    private WebElement valueClassVM;


    @FindBy(xpath = "//*[@id='compute']//div[@class='md-list-item-text ng-binding'and contains(text(),' Instance type:')]")
    private WebElement valueInstanceType;


    @FindBy(xpath = "//*[@id='compute']//div[@class='md-list-item-text ng-binding'and contains(text(),' Region:')]")
    private WebElement valueRegion;


    @FindBy(xpath = "//*[@id='compute']//div[@class='md-list-item-text ng-binding'and contains(text(),' Total')]")
    private WebElement valueLocalSSD;


    @FindBy(xpath = "//*[@id='compute']//div[@class='md-list-item-text ng-binding'and contains(text(),'Commitment term:')]")
    private WebElement valueCommitmentTerm;

    @FindBy(xpath = "//*[@id='resultBlock']//h2/b")
    private WebElement valueAmount;

    @FindBy(xpath = "//*[@id='email_quote']")
    private WebElement buttonEmailEstimate;

    @FindBy(xpath = "//input[@type='email']")
    private WebElement feildEmailSet;

    @FindBy(xpath = "//button[@aria-label='Send Email']")
    private WebElement buttonSendEmail;


    public String getValueMachineClass() {
        String value = valueClassVM.getText();
        return value;
    }

    public String getValueInstanceType() {
        String value = valueInstanceType.getText();
        return value;
    }

    public String getValueRegion() {
        String value = valueRegion.getText();
        return value;
    }

    public String getValueLocalSSD() {
        String value = valueLocalSSD.getText();
        return value;
    }


    public String getValueCommitmentTerm() {
        String value = valueCommitmentTerm.getText();
        return value;
    }

    public String getValueAmuont() {
        String value = valueAmount.getText();
        return value;
    }

    public void pushButtonEmail() {
        js.executeScript("arguments[0].click()",buttonEmailEstimate);

    }

    public void setEmail(String email) {
        js.executeScript("arguments[0].click()",feildEmailSet);
        feildEmailSet.sendKeys(email);
    }

    public void sendResult() {
        js.executeScript("arguments[0].click()",buttonSendEmail);
    }
}
