package tests;

import baseTests.BaseTest;
import org.testng.annotations.Test;

public class TestSignUpPage extends BaseTest {

    @Test
    public void registerNowUIValidations() {
        pm.preLoginPage().clickOnVendorLoginButton();
        pm.signUpPage().verifyGoogleBtn();
        pm.signUpPage().verifyFacebookBtn();
        pm.vendorLoginPage().clickRegisterNowlink();
        pm.signUpPage().verifySignUpHeaderTxt();
        pm.signUpPage().verifyemailHeaderTxt();
        pm.signUpPage().verifymobileNoHeaderTxt();
        pm.signUpPage().verifypasswordHeaderTxt();
        pm.signUpPage().verifyfirstNameHeaderTxt();
        pm.signUpPage().verifylastNameHeaderTxt();
        pm.signUpPage().verifyaptSuiteBuildingHeaderTxt();
        pm.signUpPage().verifystreetCityAddressHeaderTxt();
        pm.signUpPage().verifypostCodeHeaderTxt();
        pm.signUpPage().verifyLoginHereLink();
    }

    @Test
    public void enterValuesForSignUP() {
        pm.preLoginPage().clickOnVendorLoginButton();
        pm.vendorLoginPage().clickRegisterNowlink();
        pm.signUpPage().randmEmail();
        pm.signUpPage().randomMobileNumbers();
        pm.signUpPage().randomPassword();
        pm.signUpPage().randomFirstName();
        pm.signUpPage().randomLastName();
        pm.signUpPage().randomAptSuiteBldgName();
        pm.signUpPage().randomStreetCityAddressName();
        pm.signUpPage().randomPostCode();
        pm.signUpPage().clickLoginHereLink();

    }

    @Test
    public void signUpFieldValidation() {
        pm.preLoginPage().clickOnVendorLoginButton();
        pm.vendorLoginPage().clickRegisterNowlink();
        pm.signUpPage().performEmailValidations();
        pm.signUpPage().performMobileNoValidation();
        pm.signUpPage().performPassword8CharsValidation();
        pm.signUpPage().performPasswordUpperCaseValidation();
        pm.signUpPage().performPasswordOneNumberValidation();
        pm.signUpPage().performPasswordSpecialcharValidation();
        pm.signUpPage().performFirstNameValidation();
        pm.signUpPage().performLastNameValidation();
        pm.signUpPage().performAptSuiteBldgValidation();
        pm.signUpPage().performStreetCityAddressValidation();
        pm.signUpPage().performPostCodeValidation();
        pm.signUpPage().verifySignUpBtn();
    }

}
