package tests;

import baseTests.BaseTest;
import org.testng.annotations.Test;

public class TestFavouritesPage extends BaseTest {
    @Test
    public void testTendersTab(){
        pm.preLoginPage().clickOnStaffLoginButton();
        pm.StaffLoginPage().performLogin("uday@malaysiaairports.com.my");
        pm.StaffLoginPage().performPassword("Apss@042024");

    }
}
