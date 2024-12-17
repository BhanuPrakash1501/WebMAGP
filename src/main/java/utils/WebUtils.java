package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

public class WebUtils {
    private WebDriver _driver;


    public WebUtils(WebDriver driver) {

        this._driver = driver;
    }

    public void click(By loc, String name) {
        WebElement ele = _driver.findElement(loc);
        ele.isDisplayed();
        ele.click();
        System.out.println(name + " element is clicked");
    }

    public void clearTxt(By loc){
        _driver.findElement(loc).clear();
    }

    public void elementSendKeys(By loc, String val) {
        WebElement ele = _driver.findElement(loc);
        ele.sendKeys(val);

    }

    public void maximizeWindow() {
        _driver.manage().window().maximize();
    }

    public String elementGetText(By loc) {
        String text = _driver.findElement(loc).getText();
        return text;

    }

    public void scrollInsideSignUpPopup() {
        JavascriptExecutor js = (JavascriptExecutor) _driver;
        WebDriverWait wait = new WebDriverWait(_driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
        js.executeScript("document.querySelector('.signup-box').scrollTop=5000");

    }

    public String randomString(int x) {
        String name = RandomStringUtils.randomAlphabetic(x);
        return name;
    }

    public String randomNumber(int y) {
        String number = RandomStringUtils.randomNumeric(y);
        return number;
    }

    public String randomAlphaNumeric(int x, int y) {
        String name = RandomStringUtils.randomAlphabetic(x);
        String number = RandomStringUtils.randomNumeric(y);
        return (name + number);
    }

    public void scrollPageToDown() {
        JavascriptExecutor js = (JavascriptExecutor) _driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
    }

    public void switchToWindow(String window) {
        _driver.switchTo().window(window);
    }

    public String getWindowHandle() {
        return _driver.getWindowHandle();

    }

    public Set<String> getWindowHandles() {
        return _driver.getWindowHandles();
    }

    public void implicitWait(long time) {
        _driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
    }
    public void verifyElementIsDisplayed(By loc, String msg){
        Assert.assertTrue(_driver.findElement(loc).isDisplayed(),msg+" is Displayed");
    }
    public  void scrollToElement(By loc){
       WebElement ele = _driver.findElement(loc);
        JavascriptExecutor js =(JavascriptExecutor)_driver;
        js.executeScript("arguments[0].scrollIntoView();", ele);

    }
    public void clickUsingJavaScript(By loc){
        WebElement ele = _driver.findElement(loc);
        JavascriptExecutor js =(JavascriptExecutor)_driver;
        js.executeScript("arguments[0].click();",ele);

    }



}
