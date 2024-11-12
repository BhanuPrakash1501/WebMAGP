package PageClasses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageLocators.HomePageLoc;
import utils.WebUtils;

public class HomePage extends WebUtils implements HomePageLoc {
    private WebDriver _driver;

    public HomePage(WebDriver driver) {
        super(driver);
        this._driver = driver;
    }

    public void verifyWelcomeToMagpTxt() {
        String welcomeToMagptxt = elementGetText(welcomeToMagpTxt);
        Assert.assertEquals(welcomeToMagptxt, "Welcome to MAGP");
    }

    public void verifyPurchaseIdTxt() {
        String purchaseIdTxt = elementGetText(purchaseIDTxt);
        Assert.assertEquals(purchaseIdTxt, "Purchase ID");
    }

    public void verifyPurchaseIdDescTxt() {
        String purchaseIdDescTxt = elementGetText(purchaseIDPopDescTxt);
        Assert.assertEquals(purchaseIdDescTxt, "Purchase login ID to access an expanded array of modules and features");
    }

    public void verifyLatestAnnouncementTxt() {
        scrollToElement(latestAnnouncementsTxt);
        String latestAnnouncementTxt = elementGetText(latestAnnouncementsTxt);
        Assert.assertEquals(latestAnnouncementTxt, "Latest Announcements");
    }

    public void verifyLast7DaysTxt() {
        String last7DaysTxt = elementGetText(last7daysTxt);
        Assert.assertEquals(last7DaysTxt, "Last 7 days");
    }

    public void verifyViewAll() {
        scrollToElement(viewAllBtn);
        String viewAllTxt = elementGetText(viewAllBtn);
        Assert.assertEquals(viewAllTxt, "View All");
    }

    public void clickOnIntroductionModule() {
        click(crossbtn, "close pop up");
        clickUsingJavaScript(introductionCard);
    }
    public void clickPurchaseID(){
        click(linkPurchaseID, "Purchase ID");
    }
}
