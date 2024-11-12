package PageClasses;

import org.openqa.selenium.WebDriver;
import pageLocators.ProfilePageLoc;
import utils.WebUtils;

public class ProfilePage extends WebUtils implements ProfilePageLoc {
    private WebDriver _driver;

    public ProfilePage(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void clickProfileBtn(){
        click(btnProfile,"profile");
    }
    public void needToPurchaseTxt(){
        elementGetText(txtNeedToPurchase);
    }

    public void clickEditProfileBtn(){
        click(btnEditProfile,"Edit profile");
    }

    public void enterValuesEditProfile()  {
        clearTxt(firstNameField);
        _driver.findElement(firstNameField).sendKeys(randomString(4));
        clearTxt(mobileNumberField);
        _driver.findElement(mobileNumberField).sendKeys(randomNumber(9));
        clearTxt(lastNameField);
        _driver.findElement(lastNameField).sendKeys(randomString(4));
        clearTxt(aptSuiteBldgField);
        _driver.findElement(aptSuiteBldgField).sendKeys(randomString(5));
        clearTxt(streetCityAddressField);
        _driver.findElement(streetCityAddressField).sendKeys(randomString(5));
        clearTxt(postcodeField);
        _driver.findElement(postcodeField).sendKeys(randomNumber(6));
        click(btnSave,"save");


    }

    public void clickXbuttonEditProfile(){
        click(btnXEditProPopUp,"cross button");
    }
}
