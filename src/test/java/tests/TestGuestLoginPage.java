package tests;

import baseTests.BaseTest;
import org.testng.annotations.Test;

public class TestGuestLoginPage extends BaseTest {
 //guest login
    @Test
    public void TestGuestLogin(){
        pm.preLoginPage().clickOnStaffLoginButton();
        pm.staffLoginPage().performLogin("uday@malaysiaairports.com.my");
        pm.staffLoginPage().performPassword("Apss@042024");

    }
}
