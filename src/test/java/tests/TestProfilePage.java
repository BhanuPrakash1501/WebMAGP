package tests;

import baseTests.BaseTest;
import org.testng.annotations.Test;

public class TestProfilePage extends BaseTest {

    @Test
    public void testProfilePage() {
        pm.preLoginPage().clickOnVendorLoginButton();
        pm.vendorLoginPage().performLogin("palepu.jk@gmail.com", "Test@123456");
        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
    }

    @Test
    public void testEditProfileFields() {
        pm.preLoginPage().clickOnVendorLoginButton();
        pm.vendorLoginPage().performLogin("palepu.jk@gmail.com", "Test@123456");
        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickEditProfileBtn();
        pm.profilePage().enterValuesEditProfile();

    }

    @Test
    public void testXbuttonEditProfile() {
        pm.preLoginPage().clickOnVendorLoginButton();
        pm.vendorLoginPage().performLogin("palepu.jk@gmail.com", "Test@123456");
        pm.vendorLoginPage().xbutton();
        pm.profilePage().clickProfileBtn();
        pm.profilePage().clickEditProfileBtn();
        pm.profilePage().clickXbuttonEditProfile();


    }
}
