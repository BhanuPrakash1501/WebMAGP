package tests;

import baseTests.BaseTest;
import org.testng.annotations.Test;

public class TestForgetPasswordPage extends BaseTest {

    @Test
    public void verifyInvalidEmail() {
        pm.preLoginPage().clickOnVendorLoginButton();
        pm.vendorLoginPage().clickForgetPassworslink();
        pm.forgetPasswordPage().verifyForgetPasswordHeadingtxt();
        pm.forgetPasswordPage().verifyValidEMailAdressTxt();
        pm.forgetPasswordPage().verifySendLinkButton();
        pm.forgetPasswordPage().verifyGobackToLoginBtn();
        pm.vendorLoginPage().verifyLoginHeaderTxt();

    }

}
