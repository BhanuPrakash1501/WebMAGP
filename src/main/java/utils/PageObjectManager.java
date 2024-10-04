package utils;

import PageClasses.ForgetPasswordPage;
import PageClasses.PreLoginPage;
import PageClasses.SignUpPage;
import PageClasses.VendorLoginPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public WebDriver _driver;

    public PageObjectManager(WebDriver driver) {
        this._driver = driver;
    }

    public PreLoginPage preLoginPage;
    public VendorLoginPage vendorLoginPage;
    public SignUpPage signUpPage;
    public ForgetPasswordPage forgetPasswordPage;

    public PreLoginPage preLoginPage() {
        if (preLoginPage == null) {
            preLoginPage = new PreLoginPage(_driver);
        }
        return preLoginPage;
    }

    public VendorLoginPage vendorLoginPage() {
        if (vendorLoginPage == null) {
            vendorLoginPage = new VendorLoginPage(_driver);
        }
        return vendorLoginPage;
    }

    public SignUpPage signUpPage() {
        if (signUpPage == null) {
            signUpPage = new SignUpPage(_driver);
        }
        return signUpPage;
    }

    public ForgetPasswordPage forgetPasswordPage() {
        if (forgetPasswordPage == null) {
            forgetPasswordPage = new ForgetPasswordPage(_driver);
        }
        return forgetPasswordPage;
    }
}
