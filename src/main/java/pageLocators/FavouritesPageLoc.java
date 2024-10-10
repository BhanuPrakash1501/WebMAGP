package pageLocators;

import org.openqa.selenium.By;

public interface FavouritesPageLoc {
    By tabManual = By.xpath("//h6[normalize-space()='Manuals']");
    By tabTenders = By.xpath("//h6[normalize-space()='Tenders']");

}
