package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 22.10.2019.
 */
public class LocalDriver {
    private  static final  String CHROME="webdriver.chrome.driver";
    private  static final  String CHROME_PATH="E:\\webdriver\\chromedriver.exe";

    private  static WebDriver driver;

    public LocalDriver() {
    }

    static {
        initWebDriver();
    }

    public  static  WebDriver initWebDriver(){
        System.setProperty(CHROME,CHROME_PATH);
        if(driver==null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return  driver;
    }

    public static  void  stopWebDriver(){
        driver.quit();
        driver=null;
    }


}
