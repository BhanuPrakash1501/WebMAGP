package PageClasses;

import org.openqa.selenium.WebDriver;
import pageLocators.StaffLoginLoc;
import utils.WebUtils;


public class StaffLoginPage extends WebUtils implements StaffLoginLoc {
    private WebDriver _driver;

    public StaffLoginPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void performLogin(String username) {
       elementSendKeys(signEmail,username);
       clickUsingJavaScript(btnNext);
//       click(btnSignIn,"SignIn");
    }

    public void performPassword(String password) {

        elementSendKeys(btnPass, password);
        click(btnSignIn,"SignIn");
        click(btnNo,"No");

    }
}