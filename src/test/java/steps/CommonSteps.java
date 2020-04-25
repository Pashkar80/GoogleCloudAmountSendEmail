package steps;

import entity.Order;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import service.OrderCreator;
import util.ParseString;

import java.util.ArrayList;


public class CommonSteps {
    private WebDriver driver;
    private String request = "Google Cloud Platform Pricing Calculator";
    Order order = OrderCreator.withDataFromTask();
    public CommonSteps(WebDriver driver) {
        this.driver = driver;
    }


    public MainPage pageSearching(String request) {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.searchingPage(request);
        return mainPage;
    }

    public PageResultsOfSearch getSearchingResult() {
        PageResultsOfSearch pageResultsOfSearch = new PageResultsOfSearch(driver);
        pageResultsOfSearch.getResultOfSearch();
        return pageResultsOfSearch;
    }

    public  void sendEmail(String email){
        PageOfResultsEnterData pageOfResultsEnterData = new PageOfResultsEnterData(driver);
        pageOfResultsEnterData.pushButtonEmail();
        pageOfResultsEnterData.setEmail(email);
        pageOfResultsEnterData.sendResult();

    }

    public  String produceEmailName(){
        PageCreateEmail pageCreateEmail = new PageCreateEmail(driver);
        String emailName= pageCreateEmail.getNameEmail();
        return  emailName;

    }

    public  void openEmail(){
        PageCreateEmail pageCreateEmail = new PageCreateEmail(driver);
        pageCreateEmail.pushButtonOpenEmail();

    }

    public PageOfCalculator fillOrderForm(String value) {
        PageOfCalculator pageOfCalculator = new PageOfCalculator(driver);
        pageOfCalculator.setValueOfInstance(value);
        pageOfCalculator.selectOperationSystem();
        pageOfCalculator.selectMachineClass();
        pageOfCalculator.selectMachineType();
        pageOfCalculator.addGPU();
        pageOfCalculator.selectSelectLocalSSD();
        pageOfCalculator.selectDataCenterLocation();
        pageOfCalculator.selectValueCommitedUsage();
        pageOfCalculator.submitAddEstimate();
        return pageOfCalculator;
    }

    public String getAmountFromGoogleForm()  {
        CommonSteps steps= new CommonSteps(driver);
        String name=steps.produceEmailName();
        String email=driver.getWindowHandle();
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.open('https://cloud.google.com/');");
        new WebDriverWait(driver,10).until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> allWindows_1 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(allWindows_1.get(1));
        steps.pageSearching(request);
        steps.getSearchingResult();
        steps.fillOrderForm(order.getCountInstance());
        String value = steps.getTitleValueAmount();
        steps.sendEmail(name);
        String calc=driver.getWindowHandle();
        driver.switchTo().window(email);
        javascriptExecutor.executeScript("window.scrollBy(0,450)", "");
        return value;
    }


    public  String valueAmountEmail(){
        PageCreateEmail pageCreateEmail = new PageCreateEmail(driver);
        CommonSteps steps = new CommonSteps(driver);
        steps.openEmail();
        String value = pageCreateEmail.getAmount();
        return value;
    }

    public  String getTitleValueAmount(){
        PageOfResultsEnterData pageOfResultsEnterData = new PageOfResultsEnterData(driver);
        String title = pageOfResultsEnterData.getValueAmuont();
        String value = ParseString.parseLineForWordsOnMiddle(title);
        return value;
    }

    public String getTitleVirtualMachineClass() {
        PageOfResultsEnterData pageOfResultsEnterData = new PageOfResultsEnterData(driver);
        String title = pageOfResultsEnterData.getValueMachineClass();
        String value = ParseString.getPartString(title);
        return value;
    }

    public String getTitleInstanceType() {
        PageOfResultsEnterData pageOfResultsEnterData = new PageOfResultsEnterData(driver);
        String title = pageOfResultsEnterData.getValueInstanceType();
        String value = ParseString.getPartString(title);
        return value;
    }

    public String getTitleRegion() {
        PageOfResultsEnterData pageOfResultsEnterData = new PageOfResultsEnterData(driver);
        String title = pageOfResultsEnterData.getValueRegion();
        String value = ParseString.getPartString(title);
        return value;
    }

    public String getTitleLocalSSD() {
        PageOfResultsEnterData pageOfResultsEnterData = new PageOfResultsEnterData(driver);
        String title = pageOfResultsEnterData.getValueLocalSSD();
        String value= ParseString.parseLineForLastsWords(title);
        return value;
    }

    public String getTitleCommitmentTerm() {

        PageOfResultsEnterData pageOfResultsEnterData = new PageOfResultsEnterData(driver);
        String title = pageOfResultsEnterData.getValueCommitmentTerm();
        String value = ParseString.getPartString(title);
        return value;

    }




}
