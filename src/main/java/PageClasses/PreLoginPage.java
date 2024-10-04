package PageClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageLocators.PreLoginPageLoc;
import utils.WebUtils;

public class PreLoginPage extends WebUtils implements PreLoginPageLoc {

    private WebDriver _driver;

    public PreLoginPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyPreLoginPage() {
        String actUrl = _driver.getCurrentUrl();
        Assert.assertEquals(actUrl, "https://magp-nprod-fe.myairports.com.my/auth");
    }

    public void verifyVendorLoginButton() {
        Assert.assertTrue(_driver.findElement(btnVendorLogin).isDisplayed());

    }

    public void verifyStaffLoginButton() {
        verifyElementIsDisplayed(btnStaffLogin,"Staff Login button");
        Assert.assertTrue(_driver.findElement(btnStaffLogin).isDisplayed());
    }

    public void verifyGuestLoginButton() {
        Assert.assertTrue(_driver.findElement(btnGuestLogin).isDisplayed());
    }

    public void clickOnVendorLoginButton() {
        click(btnVendorLogin, "Vendor Login");
    }

    public void clickOnStaffLoginButton() {
        click(btnStaffLogin, "Staff Login");
    }

    public void clickOnGuestLoginButton() {
        click(btnGuestLogin, "Guest login");
    }
}
