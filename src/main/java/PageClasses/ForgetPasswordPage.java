package PageClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageLocators.ForgetPasswordPageLoc;
import utils.WebUtils;

public class ForgetPasswordPage extends WebUtils implements ForgetPasswordPageLoc {
    private WebDriver _driver;

    public ForgetPasswordPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyValidEMailAdressTxt() {
        elementSendKeys(emailAddressField, "xixoja1991@craftapk.com");
//        String validEmailAddressMailTxt = elementGetText(validEmailAddressErrorTxt);
//        Assert.assertEquals(validEmailAddressMailTxt, "Please enter a valid email address");

    }

    public void verifySendLinkButton() {
        boolean status = _driver.findElement(sendLinkBtn).isDisplayed();
        Assert.assertTrue(status);
    }

    public void verifyForgetPasswordHeadingtxt() {
        String forgetHeadingtxt = elementGetText(forgotPasswordTxt);
        Assert.assertEquals(forgetHeadingtxt, "Forgot Password");
    }

    public void verifyGobackToLoginBtn() {
        click(goBackToLoginLink, "Go Back To Login");

    }
}
