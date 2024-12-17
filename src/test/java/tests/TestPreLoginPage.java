package tests;

import baseTests.BaseTest;
import org.testng.annotations.Test;

public class TestPreLoginPage extends BaseTest {

    //prelogin
    @Test
    public void testProLoginPageUI(){
        pm.preLoginPage().verifyPreLoginPage();
        pm.preLoginPage().verifyStaffLoginButton();
        pm.preLoginPage().verifyVendorLoginButton();
        pm.preLoginPage().verifyGuestLoginButton();
    }

    @Test
    public void test(){
        pm.preLoginPage().verifyVendorLoginButton();
        pm.preLoginPage().verifyGuestLoginButton();
    }

}
