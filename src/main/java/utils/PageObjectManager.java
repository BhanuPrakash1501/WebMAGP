package utils;

import PageClasses.*;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public WebDriver _driver;

    public PageObjectManager(WebDriver driver) {
        this._driver = driver;
    }

    public PreLoginPage preLoginPage;
    public VendorLoginPage vendorLoginPage;
    public SignUpPage signUpPage;
    public ForgetPasswordPage forgetPasswordPage;
    public HomePage homePage;
    public IntroductionPage introductionPage;
    public StaffLoginPage staffLoginPage;
    public FavouritesPage favouritesPage;
    public ProfilePage profilePage;

    public PreLoginPage preLoginPage() {
        if (preLoginPage == null) {
            preLoginPage = new PreLoginPage(_driver);
        }
        return preLoginPage;
    }

    public VendorLoginPage vendorLoginPage() {
        if (vendorLoginPage == null) {
            vendorLoginPage = new VendorLoginPage(_driver);
        }
        return vendorLoginPage;
    }

    public SignUpPage signUpPage() {
        if (signUpPage == null) {
            signUpPage = new SignUpPage(_driver);
        }
        return signUpPage;
    }

    public ForgetPasswordPage forgetPasswordPage() {
        if (forgetPasswordPage == null) {
            forgetPasswordPage = new ForgetPasswordPage(_driver);
        }
        return forgetPasswordPage;
    }

    public HomePage homePage(){
        if(homePage == null){
            homePage= new HomePage(_driver);
        }
        return homePage;
    }
    public IntroductionPage introductionPage(){
        if(introductionPage == null){
            introductionPage =  new IntroductionPage(_driver);
        }
        return introductionPage;
    }

    public StaffLoginPage staffLoginPage(){
        if (staffLoginPage == null){
            staffLoginPage= new StaffLoginPage(_driver);
        }
        return staffLoginPage;
    }
    public FavouritesPage FavouritesPage(){
        if (favouritesPage  == null){
            favouritesPage = new FavouritesPage(_driver);
        }
        return favouritesPage;
    }

    public ProfilePage profilePage(){
        if(profilePage == null){
            profilePage = new ProfilePage(_driver);
        }
        return profilePage;

    }
}
