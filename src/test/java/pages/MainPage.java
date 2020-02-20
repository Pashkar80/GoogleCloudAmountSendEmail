package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by user on 22.10.2019.
 */
public class MainPage extends PageObject {
private  static  final  String BASE_URL=" https://cloud.google.com/";


    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void openPage() {
        driver.get(BASE_URL);

    }

    WebDriverWait wait = new WebDriverWait(driver, 10);


   @FindBy(xpath = "//input[@placeholder='Результаты поиска']")
    private WebElement searchButton;


public void searchingPage(String request){
    wait.until(ExpectedConditions.elementToBeClickable(searchButton));
    searchButton.click();
    searchButton.sendKeys(request);
    searchButton.submit();
}
}