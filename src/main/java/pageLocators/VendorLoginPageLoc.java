package pageLocators;

import org.openqa.selenium.By;

public interface VendorLoginPageLoc {
    By emailAddressField = By.id("Email Address");
    By emailAddressLabelName = By.xpath("//*[text()='Email Address *']");
    By passwordField = By.id("Password");
    By passwordLabelName = By.xpath("//*[text()='Password *']");
    By submitbtn = By.xpath("//button[text()='Submit']");
    By forgetPasswordLink = By.xpath("//a[text()='Forgot Password?']");
    By googleBtn = By.xpath("//button[@class='btn btn-outline-secondary me-5 align-items-center']");
    By facebookBtn = By.xpath("//button[@class='btn btn-outline-secondary']");
    By registerNowLink = By.xpath("//a[text()='Register Now']");
    By welcomeTxt = By.xpath("//h3[text()='Welcome']");
    By welcomeImageDesTxt = By.xpath("//h5[text()='Procurement Manual of Procurement Policies, Procedures & Guidelines']");
    By dontHaveAnAccountTxt = By.xpath("//h5[contains(.,'Procurement')]");
    By pleaseEnterValidEmailAddressTxt = By.xpath("//div[text()='Please enter a valid email address']");
    By loginHeaderTxt = By.xpath("//h2[text()='Login']");
    By btnX = By.xpath("//div[@class='position-absolute close-icon']//button");

}
