package pageLocators;

import org.openqa.selenium.By;

public interface IntroductionPageLoc {

    By btnprefaceViewMore = By.xpath("//h2[text()='Preface']/following-sibling::a");
    By btnprocurementCodesofethicsviewMore = By.xpath("//h2[text()='Procurement Codes of ethics']/following-sibling::a");
    By btngeneralProvisionviewMore = By.xpath("//h2[text()='General Provision']/following-sibling::a"   );
    By btnprocessesSymbolsviewMore = By.xpath("//h2[text()='Processes Symbols']/following-sibling::a");
    By btnprocurementValueChainviewMore = By.xpath("//h2[text()=\"MAHB's Procurement Value Chain\"]/following-sibling::a");
    By wantToViewMoreTxt = By.xpath("//h5[text()='Want to view more?']");
    By wantToViewMoreContentTxt = By.xpath("//p[text()='If you want to view more content please Purchase Login ID']");
    By btnpurchaseLogin = By.xpath("//a[text()='Purchase Login ID']");
    By comingSoonTxt = By.xpath("//b[text()='Coming Soon']");
    By weWillNotifyYouTxt = By.xpath("//p[text()='We will notify you as soon as this feature becomes available. Thank you for your patience!']");
    By btnbackToHomePage = By.xpath("//a[.='Back to Homepage']");
    By loginIdPurchasetxt = By.xpath("//b[text()='Login ID Purchase']");
    By btnbackArrow = By.xpath("//img[@class='icon-lg me-3']");

}

