package pageLocators;

import org.openqa.selenium.By;

public interface PreLoginPageLoc {
    By btnStaffLogin = By.xpath("//button[.='Staff Login']");
    By btnVendorLogin = By.xpath("//a[.='Vendor Login']");
    By btnGuestLogin = By.xpath("//button[.='Guest Login']");
}
