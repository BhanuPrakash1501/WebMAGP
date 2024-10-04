package PageClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageLocators.SignUpPageLoc;
import utils.WebUtils;

public class SignUpPage extends WebUtils implements SignUpPageLoc {
    private WebDriver _driver;

    public SignUpPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifySignUpHeaderTxt() {
        String signuptxt = elementGetText(signUpHeaderTxt);
        Assert.assertEquals(signuptxt, "Signup");
    }

    public void verifyemailHeaderTxt() {
        String emailtxt = elementGetText(emailAddressLabelName);
        Assert.assertEquals(emailtxt, "Email *");
    }

    public void verifymobileNoHeaderTxt() {
        String mobileNotxt = elementGetText(mobileNumberLabelName);
        Assert.assertEquals(mobileNotxt, "Mobile Number *");
    }

    public void verifyfirstNameHeaderTxt() {
        String firstNametxt = elementGetText(firstNameLabelName);
        Assert.assertEquals(firstNametxt, "First Name *");
    }

    public void verifypasswordHeaderTxt() {
        String passwordtxt = elementGetText(passwordLabelName);
        Assert.assertEquals(passwordtxt, "Password *");
    }

    public void verifylastNameHeaderTxt() {
        String lastNametxt = elementGetText(lastNameLabelName);
        Assert.assertEquals(lastNametxt, "Last Name *");
    }

    public void verifyaptSuiteBuildingHeaderTxt() {
        scrollInsideSignUpPopup();
        String aptSuiteBuildingtxt = elementGetText(aptSuiteBldgLabelName);
        Assert.assertEquals(aptSuiteBuildingtxt, "Apartment, Suite, Building... *");
    }

    public void verifystreetCityAddressHeaderTxt() {
        String streetCityAddresstxt = elementGetText(streetCityAddressLabelName);
        Assert.assertEquals(streetCityAddresstxt, "Street City and Address *");
    }

    public void verifypostCodeHeaderTxt() {
        String postCodetxt = elementGetText(postcodeLabelName);
        Assert.assertEquals(postCodetxt, "Postcode *");
    }

    public void verifySignUpBtn() {
        Assert.assertTrue(_driver.findElement(signUpHeaderTxt).isDisplayed());

    }

    public void verifyGoogleBtn() {
        Assert.assertTrue(_driver.findElement(googleBtn).isDisplayed());

    }

    public void verifyFacebookBtn() {
        Assert.assertTrue(_driver.findElement(facebookBtn).isDisplayed());

    }

    public void performEmailValidations() {
        elementSendKeys(emailAddressField, "as");
        String emailErrortxt = elementGetText(emailAddressErrorMssgTxt);
        Assert.assertEquals(emailErrortxt, "Please enter a valid email address");

    }

    public void performMobileNoValidation() {
        elementSendKeys(mobileNumberField, "23");
        String mobileNoErrortxt = elementGetText(mobileNoErrorMssgTxt);
        Assert.assertEquals(mobileNoErrortxt, "Please enter a valid 4-16 digit mobile number");

    }

    public void performPassword8CharsValidation() {
        elementSendKeys(passwordField, "as");
        String pass8charsLongErrortxt = elementGetText(password8charslongErrorMssgTxt);
        Assert.assertEquals(pass8charsLongErrortxt, "Password must be at least 8 characters long.");

    }

    public void performPasswordUpperCaseValidation() {
        elementSendKeys(passwordField, "cdefgh");
        String passUpperCaseErrortxt = elementGetText(passwordUpperCaseErrorMssgTxt);
        Assert.assertEquals(passUpperCaseErrortxt, "Password must contain at least one uppercase letter.");

    }

    public void performPasswordSpecialcharValidation() {
        elementSendKeys(passwordField, "1");
        String passOneSpecialCharErrortxt = elementGetText(passwordatLeastOneSpecialcharErrorMssgTxt);
        Assert.assertEquals(passOneSpecialCharErrortxt, "Password must contain at least one special character.");

    }

    public void performPasswordOneNumberValidation() {
        elementSendKeys(passwordField, "U");
        String passOneNumberErrortxt = elementGetText(passwordatLeastOneNumberErrorMssgTxt);
        Assert.assertEquals(passOneNumberErrortxt, "Password must contain at least one number.");

    }

    public void performFirstNameValidation() {
        scrollInsideSignUpPopup();
        elementSendKeys(firstNameField, "a");
        String firstNameErrortxt = elementGetText(fieldCharLengthErrorMssgTxt);
        Assert.assertEquals(firstNameErrortxt, "This field must be at least 2 characters long");

    }

    public void performLastNameValidation() {
        elementSendKeys(lastNameField, "l");
        String lastNameErrortxt = elementGetText(fieldCharLengthErrorMssgTxt);
        Assert.assertEquals(lastNameErrortxt, "This field must be at least 2 characters long");

    }

    public void performAptSuiteBldgValidation() {
        elementSendKeys(aptSuiteBldgField, "a");
        String aptSuiteBldgErrortxt = elementGetText(fieldCharLengthErrorMssgTxt);
        Assert.assertEquals(aptSuiteBldgErrortxt, "This field must be at least 2 characters long");

    }

    public void performStreetCityAddressValidation() {
        elementSendKeys(streetCityAddressField, "a");
        String streetCityAddressBldgErrortxt = elementGetText(fieldCharLengthErrorMssgTxt);
        Assert.assertEquals(streetCityAddressBldgErrortxt, "This field must be at least 2 characters long");

    }

    public void performPostCodeValidation() {
        elementSendKeys(postcodeField, "98");
        String postCodeErrortxt = elementGetText(postCodeErrorMssgTxt);
        Assert.assertEquals(postCodeErrortxt, "Please enter a valid 4-6 pincode");

    }

    public void randmEmail() {
        _driver.findElement(emailAddressField).sendKeys(randomString(4) + "@gmail.com");

    }

    public void randomMobileNumbers() {
        _driver.findElement(mobileNumberField).sendKeys(randomNumber(9));

    }

    public void randomPassword() {

        _driver.findElement(passwordField).sendKeys(randomString(4) + "@" + randomNumber(3));
    }

    public void randomFirstName() {
        scrollInsideSignUpPopup();
        _driver.findElement(firstNameField).sendKeys(randomString(4));
    }

    public void randomLastName() {
        _driver.findElement(lastNameField).sendKeys(randomString(4));
    }

    public void randomAptSuiteBldgName() {
        _driver.findElement(aptSuiteBldgField).sendKeys(randomString(5));
    }

    public void randomStreetCityAddressName() {
        _driver.findElement(streetCityAddressField).sendKeys(randomString(5));
    }

    public void randomPostCode() {
        _driver.findElement(postcodeField).sendKeys(randomNumber(6));
    }

    public void verifyLoginHereLink() {
        scrollPageToDown();
        String loginHereTxt = elementGetText(loginhereLink);
        Assert.assertEquals(loginHereTxt, "Login Here");
    }

    public void clickLoginHereLink() {

        scrollPageToDown();
        click(loginhereLink, "Login Here");

    }

}
