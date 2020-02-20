package pages;

import org.openqa.selenium.WebDriver;

import javax.naming.OperationNotSupportedException;

/**
 * Created by user on 22.10.2019.
 */
public abstract class PageObject {
    protected WebDriver driver;
    public  abstract  void  openPage() throws OperationNotSupportedException;

    public PageObject(WebDriver driver) {
        this.driver = driver;
    }
}
