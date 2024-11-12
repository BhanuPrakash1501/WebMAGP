package PageClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageLocators.VendorLoginPageLoc;
import utils.WebUtils;

public class VendorLoginPage extends WebUtils implements VendorLoginPageLoc {
    private WebDriver _driver;

    public VendorLoginPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyVendorLoginPage() throws InterruptedException {
        Thread.sleep(2000);
        String vendorUrl = _driver.getCurrentUrl();
        Assert.assertEquals(vendorUrl, "https://magp-nprod-fe.myairports.com.my/auth/login");
    }

    public void verifyEmailTxt() {
        String emailText = _driver.findElement(emailAddressLabelName).getText();
        Assert.assertEquals(emailText, "Email Address *");
    }

    public void verifyPasswordTxt() {
        String passText = _driver.findElement(passwordLabelName).getText();
        Assert.assertEquals(passText, "Password *");
    }

    public void verifyForgetPasswordTxt() {
        String forgetPasswordText = _driver.findElement(forgetPasswordLink).getText();
        Assert.assertEquals(forgetPasswordText, "Forgot Password?");
    }

    public void verifyGooglebtn() {
        String Googlebtn = _driver.findElement(googleBtn).getText();
        Assert.assertEquals(Googlebtn, "Google");
    }

    public void verifyFacebookbtn() {
        String facebookbtn = _driver.findElement(facebookBtn).getText();
        Assert.assertEquals(facebookbtn, "Facebook");
    }

    public void performLogin(String email, String pass) {
        elementSendKeys(emailAddressField, email);
        elementSendKeys(passwordField, pass);
        click(submitbtn, "Submit");

    }

    public void verifyWelcomeTxt() {
        String welcoTxt = _driver.findElement(welcomeTxt).getText();
        Assert.assertEquals(welcoTxt, "Welcome");
    }

    public void verifyWelcomeParagraphTxt() {
        String welcomeparaTxt = _driver.findElement(welcomeImageDesTxt).getText();
        Assert.assertEquals(welcomeparaTxt, "Procurement Manual of Procurement Policies, Procedures & Guidelines");
    }

    public void verifyDonthaveAnAccountTxt() {
        scrollPageToDown();
        implicitWait(10);
        String dontHaveanAccountTxt = _driver.findElement(dontHaveAnAccountTxt).getText();
        boolean status = dontHaveanAccountTxt.contains("Dont have an account? ");
        Assert.assertTrue(status);

    }

    public void verifyRegisterNowLnk() {
        String registerNowlink = _driver.findElement(registerNowLink).getText();
        Assert.assertEquals(registerNowlink, "Register Now");
    }

    public void clickForgetPassworslink() {
        click(forgetPasswordLink, "Forget Password");
    }

    public void clickRegisterNowlink() {
        click(registerNowLink, "Register Now");
    }

    public void verifyLoginHeaderTxt() {
        String logintxt = _driver.findElement(loginHeaderTxt).getText();
        Assert.assertEquals(logintxt, "Login");
    }

    public void verifyInValidEmail() {
        elementSendKeys(emailAddressField, "gdssd");
        String emailErrorTxt = _driver.findElement(pleaseEnterValidEmailAddressTxt).getText();
        Assert.assertEquals(emailErrorTxt, "Please enter a valid email address");
    }

    public void xbutton(){
        click(btnX, "crossbutton");
    }

    public void googleLogin(){
        click(googleBtn, "google login");

    }


}
