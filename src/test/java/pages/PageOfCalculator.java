package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


/**
 * Created by user on 23.10.2019.
 */
public class PageOfCalculator extends PageObject {

    public PageOfCalculator(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @Override
    public void openPage() {
        driver.get("https://cloud.google.com/products/calculator/");

    }

    WebDriverWait wait = new WebDriverWait(driver, 30);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(xpath = "//*[@id='mainForm']//md-input-container/input")
    private WebElement fieldOfInstance;


    @FindBy(xpath = "//*[@id='mainForm']/descendant::md-input-container[@class='flex md-input-has-value']/md-select")
    private WebElement formOperatingSystem;
    @FindBy(xpath = "//md-option[@value='free']/div[@class='md-text']")
    private WebElement valueOperatingSystem;


    @FindBy(xpath = "//md-select[@placeholder='VM Class']//span[@class='md-select-icon']")
    private WebElement formMachineClass;
    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//div[text()='Regular']")
    private WebElement valueMachineClass;


    @FindBy(xpath = "//md-select[@placeholder='Instance type']//span[@class='md-select-icon']")
    private WebElement formMachineType;
    @FindBy(css = "md-option[value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8'] div")
    private WebElement valueMachineType;


    @FindBy(xpath = "//*[@class='md-container md-ink-ripple']")
    // @FindBy(xpath = "//md-checkbox[@class='ng-pristine ng-valid ng-empty ng-touched']/div[@class='md-container md-ink-ripple']")
    private WebElement selectAddGPU;


    @FindBy(xpath = "//md-select[@placeholder='Number of GPUs']//span[@class='md-select-icon']")
    private WebElement selectNumberGPU;
    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='1']")
    private WebElement valueNumberGPU;


    @FindBy(xpath = "//md-select[@placeholder='GPU type']//span[@class='md-select-icon']")
    private WebElement selectTypeGPU;
    @FindBy(css = "md-option[value='NVIDIA_TESLA_V100']")
    private WebElement valueTypeGPU;


    @FindBy(xpath = "//md-select[@placeholder='Local SSD']//span[@class='md-select-icon']")
    private WebElement selectLocalSSD;
    @FindBy(xpath = "//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='2']")
    private WebElement valueLocalSSD;


    @FindBy(xpath = "//md-select[@placeholder='Datacenter location']//span[@class='md-select-icon']")
    private WebElement selectDatacenterLocation;
    @FindBy(xpath = " //div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='europe-west3']")
    private WebElement valueDatacenterLocation;


    @FindBy(xpath = "//md-select[@placeholder='Committed usage']//span[@class='md-select-icon']")
    private WebElement selectCommitedUsage;
    @FindBy(xpath = "//*[@class='md-select-menu-container md-active md-clickable']//md-option[@value='1']")
    private WebElement valueCommitedUsage;


    @FindBy(xpath = "//*[@id='mainForm']/descendant::button[@class='md-raised md-primary cpc-button md-button md-ink-ripple']")
    private WebElement bottonAddEstimate;



    public void setValueOfInstance(String value)  {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
        driver.switchTo().frame("myFrame");
        wait.until(ExpectedConditions.elementToBeClickable(fieldOfInstance));
        fieldOfInstance.sendKeys(value);
    }

    public void selectOperationSystem()  {
        wait.until(ExpectedConditions.elementToBeClickable(formOperatingSystem));
        js.executeScript("arguments[0].click()", formOperatingSystem);
        wait.until(ExpectedConditions.elementToBeClickable(valueOperatingSystem));
        js.executeScript("arguments[0].click()", valueOperatingSystem);

    }

    public void selectMachineClass()  {
        wait.until(ExpectedConditions.elementToBeClickable(formMachineClass));
        js.executeScript("arguments[0].click()", formMachineClass);
        wait.until(ExpectedConditions.elementToBeClickable(formMachineClass));
        js.executeScript("arguments[0].click()", valueMachineClass);

    }


    public void selectMachineType() {
        wait.until(ExpectedConditions.elementToBeClickable(formMachineClass));
        js.executeScript("arguments[0].click()", formMachineType);
        js.executeScript("arguments[0].click()", valueMachineType);


    }

    public void addGPU() {
        wait.until(ExpectedConditions.elementToBeClickable(selectAddGPU));
        js.executeScript("arguments[0].click()", selectAddGPU);
        wait.until(ExpectedConditions.elementToBeClickable(selectNumberGPU));
        js.executeScript("arguments[0].click()", selectNumberGPU);
        wait.until(ExpectedConditions.elementToBeClickable(valueNumberGPU));
        js.executeScript("arguments[0].click()", valueNumberGPU);
        js.executeScript("arguments[0].click()", selectTypeGPU);
        js.executeScript("arguments[0].click()", valueTypeGPU);
    }

    public void selectSelectLocalSSD() {
        wait.until(ExpectedConditions.elementToBeClickable(selectLocalSSD));
        js.executeScript("arguments[0].click()", selectLocalSSD);
        wait.until(ExpectedConditions.elementToBeClickable(valueLocalSSD));
        js.executeScript("arguments[0].click()", valueLocalSSD);

    }

    public void selectDataCenterLocation() {
        wait.until(ExpectedConditions.elementToBeClickable(selectDatacenterLocation));
        js.executeScript("arguments[0].click()", selectDatacenterLocation);
        wait.until(ExpectedConditions.elementToBeClickable(valueDatacenterLocation));
        js.executeScript("arguments[0].click()", valueDatacenterLocation);
    }

    public void selectValueCommitedUsage() {
        wait.until(ExpectedConditions.elementToBeClickable(selectCommitedUsage));
        js.executeScript("arguments[0].click()", selectCommitedUsage);
        wait.until(ExpectedConditions.elementToBeClickable(valueCommitedUsage));
        valueCommitedUsage.click();
        js.executeScript("arguments[0].click()", valueCommitedUsage);


    }

    public void submitAddEstimate() {
        bottonAddEstimate.submit();
    }
}