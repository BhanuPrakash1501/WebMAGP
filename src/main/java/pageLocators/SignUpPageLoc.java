package pageLocators;

import org.openqa.selenium.By;

public interface SignUpPageLoc {
    By signUpHeaderTxt = By.xpath("//h2[text()='Signup']");
    By googleBtn = By.xpath("(//img[contains(@class, 'icon')])[1]");
    By facebookBtn = By.xpath("(//img[contains(@class, 'icon')])[2]");
    By emailAddressField = By.id("Email");
    By emailAddressLabelName = By.xpath("//*[text()='Email *']");
    By mobileNumberField = By.id("Mobile Number");
    By mobileNumberLabelName = By.xpath("//*[text()='Mobile Number *']");
    By passwordField = By.id("Password");
    By passwordLabelName = By.xpath("//*[text()='Password *']");
    By firstNameField = By.id("First Name");
    By firstNameLabelName = By.xpath("//*[text()='First Name *']");
    By lastNameField = By.id("Last Name");
    By lastNameLabelName = By.xpath("//*[text()='Last Name *']");
    By aptSuiteBldgField = By.id("Apartment, Suite, Building...");
    By aptSuiteBldgLabelName = By.xpath("//*[text()='Apartment, Suite, Building... *']");
    By streetCityAddressField = By.id("Street City and Address");
    By streetCityAddressLabelName = By.xpath("//*[text()='Street City and Address *']");
    By postcodeField = By.id("Postcode");
    By postcodeLabelName = By.xpath("//*[text()='Postcode *']");
    By submitbtn = By.xpath("//button[text()='Submit']");
    By emailAddressErrorMssgTxt = By.xpath("//div[text()='Please enter a valid email address']");
    By mobileNoErrorMssgTxt = By.xpath("//div[text()='Please enter a valid 4-16 digit mobile number']");
    By password8charslongErrorMssgTxt = By.xpath("//div[text()='Password must be at least 8 characters long.']");
    By passwordUpperCaseErrorMssgTxt = By.xpath("//div[text()='Password must contain at least one uppercase letter.']");
    By passwordatLeastOneNumberErrorMssgTxt = By.xpath("//div[text()='Password must contain at least one number.']");
    By passwordatLeastOneSpecialcharErrorMssgTxt = By.xpath("//div[text()='Password must contain at least one special character.']");
    By fieldCharLengthErrorMssgTxt = By.xpath("//div[text()='This field must be at least 2 characters long']");
    By postCodeErrorMssgTxt = By.xpath("//div[text()='Please enter a valid 4-6 pincode']");
    By loginhereLink = By.xpath("//a[text()='Login Here']");


}
