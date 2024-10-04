package pageLocators;

import org.openqa.selenium.By;

public interface ForgetPasswordPageLoc {
    By emailAddressField = By.id("Email");
    By validEmailAddressErrorTxt = By.xpath("//div[text()='Please enter a valid email address']");
    By sendLinkBtn = By.xpath("//button[text()='Send Link']");
    By goBackToLoginLink = By.xpath("//a[text()='Go Back to Login']");
    By forgotPasswordTxt = By.xpath("//h2[text()='Forgot Password']");
    By wellDoneTxt = By.xpath("//h6[text()='Well Done']");
    By passwordResetMssgTxt = By.xpath("//p[contains(.,'Password reset email successfully sent to your registered email.')]");
    By backToLoginBtn = By.xpath("//button[text()='Back To Login Page']");


}
