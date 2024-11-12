package pageLocators;

import org.openqa.selenium.By;

public interface ProfilePageLoc {

    By btnProfile = By.xpath("//img[@src='/MAGP/p2.png']");
    By txtNeedToPurchase = By.xpath("//span[text()='Need to Purchase']");
    By btnEditProfile =By.xpath("//button[text()='Edit Profile']");
    By firstNameField = By.id("First Name");
    By lastNameField = By.id("Last Name");
    By aptSuiteBldgField = By.id("Apartment, Suite, Building...");
    By streetCityAddressField = By.id("Street City and Address");
    By postcodeField = By.id("Postcode");
    By btnSave = By.xpath("//button[text()='Save']");
    By btnXEditProPopUp = By.xpath("//img[@class='img-close']");
    By mobileNumberField = By.id("Mobile Number");



}
