package PageClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageLocators.IntroductionPageLoc;
import utils.WebUtils;

public class IntroductionPage extends WebUtils implements IntroductionPageLoc {
    private WebDriver _driver;

    public IntroductionPage(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void clickPreface() {
        scrollToElement(btnprefaceViewMore);
        clickUsingJavaScript(btnprefaceViewMore);

    }

    public void clickProcurementCodesofethics() {
        scrollToElement(btnprocurementCodesofethicsviewMore);
        clickUsingJavaScript(btnprocurementCodesofethicsviewMore);
    }

    public void clickGeneralProvisions() {
        scrollToElement(btngeneralProvisionviewMore);
        clickUsingJavaScript(btngeneralProvisionviewMore);
    }

    public void verifyWantToViewMoreTxt() {
        scrollToElement(wantToViewMoreTxt);
        String wantToTxt = elementGetText(wantToViewMoreTxt);
        Assert.assertEquals(wantToTxt, "Want to view more?");

    }

    public void verifyWantToViewMoreContentTxt() {
        String wantToviewMoreContentTxt = elementGetText(wantToViewMoreContentTxt);
        Assert.assertEquals(wantToviewMoreContentTxt, "If you want to view more content please Purchase Login ID");

    }

    public void clickPurchaseID() {
        clickUsingJavaScript(btnpurchaseLogin);

    }

    public void verifyComingSoonTxt() {
        String comingSoon = elementGetText(comingSoonTxt);
        Assert.assertEquals(comingSoon, "Coming Soon");

    }

    public void verifyloginPurchaseIDTxt() {
        String loginPurchaseIDTxt = elementGetText(loginIdPurchasetxt);
        Assert.assertEquals(loginPurchaseIDTxt, "Login ID Purchase");

    }

    public void verifyWeWillNotifyYouTxt() {
        String weWillNotifyYou = elementGetText(weWillNotifyYouTxt);
        Assert.assertEquals(weWillNotifyYou, "We will notify you as soon as this feature becomes available. Thank you for your patience!");

    }

    public void clickBackToHomePage() {

    }

    public void clickBackArrow() {
        scrollPageToDown();
        clickUsingJavaScript(btnbackArrow);
    }

}
