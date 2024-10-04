package baseTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import utils.PageObjectManager;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    protected WebDriver driver;
    public PageObjectManager pm;
    private String url;
    private String browser;

    public void lunchBrowser() {
        try {
            String dir = System.getProperty("user.dir");
            FileInputStream fis = new FileInputStream(dir + "//src//test//resources//config.properties");
            Properties prop = new Properties();
            prop.load(fis);
            browser = prop.getProperty("browser");
            url = prop.getProperty("url");
            if (browser.equalsIgnoreCase("chrome"))
                driver = new ChromeDriver();
            else if (browser.equalsIgnoreCase("firefox"))
                driver = new FirefoxDriver();
            else if (browser.equalsIgnoreCase("edge"))
                driver = new EdgeDriver();
        } catch (Exception ignored) {

        }
    }
    public void maximizeWindow(){
        driver.manage().window().maximize();
    }
    public void enterUrl(){
        driver.get(url);
    }
    public void globalWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    @BeforeMethod
    public void init() {
        this.lunchBrowser();
        this.maximizeWindow();
        this.enterUrl();
        this.globalWait();
        pm = new PageObjectManager(driver);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
