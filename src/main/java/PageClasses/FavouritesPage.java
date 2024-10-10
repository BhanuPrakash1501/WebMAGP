package PageClasses;

import org.openqa.selenium.WebDriver;
import pageLocators.FavouritesPageLoc;
import utils.WebUtils;

public class FavouritesPage extends WebUtils implements FavouritesPageLoc {
    private WebDriver _driver;

    public FavouritesPage(WebDriver driver) {
        super(driver);
        this._driver=driver;
    }
    public void clickManualTab() {
        scrollToElement(tabManual);

    }

    public void clickTenderTab() {
        scrollToElement(tabTenders);
       click(tabTenders,"Tenders tab");

    }
}
