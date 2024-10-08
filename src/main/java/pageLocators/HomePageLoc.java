package pageLocators;

import org.openqa.selenium.By;

public interface HomePageLoc {
    By homeTab = By.xpath("//a[normalize-space()='Home']");
    By favouritesTab = By.xpath("//a[normalize-space()='Favourites']");
    By calendarTab = By.xpath("//a[normalize-space()='Calendar']");
    By fAQsTab = By.xpath("//a[normalize-space()='FAQs']");
    By globalSearchbar = By.xpath("//input[@placeholder='Tender Name']");
    By notificationsTab = By.xpath("//a[@role='button']//img[@src=\"/MAGP/home/p2.png\"]");
    By languageTab = By.xpath("//a[@id='nav-dropdown-ligh-example']");
    By profileTab = By.xpath("//a[@role='button']//img[@src=\"/MAGP/home/p1.png\"]");
    By introductionCard = By.xpath("//a[contains(@href,'/user/introduction?id=get-introduction-list&name=Introduction')]");
    By procurementPlanningCard = By.xpath("//a[@href='/user/introduction?id=get-procurement-planning-list&name=Procurement+Planning']");
    By requisitionCard = By.xpath("//a[@href='/user/introduction?id=get-requisition-list&name=Requisition']");
    By sourcingCard = By.xpath("//a[@href='/user/introduction?id=get-sourcing-list&name=Sourcing']");
    By contractAdministrationCard = By.xpath("//a[@href='/user/introduction?id=get-contract-administration-list&name=Contract+Administration']");
    By vendorMgntCard = By.xpath("//a[@href='/user/introduction?id=get-vendor-management-list&name=Vendor+Management']");
    By viewAllBtn = By.xpath("//a[text()='View All']");
    By introductionLink = By.xpath("//h2[normalize-space()='Introduction']");
    By lnkPreface = By.xpath("//p[normalize-space()='Preface']");
    By procurementCodesOfEthicsLink = By.xpath("//p[normalize-space()='Procurement Codes of Ethics']");
    By generalProvisionLink = By.xpath("//p[normalize-space()='General Provision']");
    By termsDefinitionsLink = By.xpath("//p[normalize-space()='Terms & Definitions']");
    By processSymbolsLink = By.xpath("//p[normalize-space()='Process Symbols']");
    By mAHBsProcurementValueChainLink = By.xpath("//p[text()='MAHB’s  Procurement value chain']");
    By contactUsBtn = By.xpath("//h2[normalize-space()='Contact Us']");
    By procurementPlanningLink = By.xpath("//h2[normalize-space()='Procurement Planning']");
    By businessCaseLink = By.xpath("//p[normalize-space()='Business Case']");
    By annualProcurementPlanningLink = By.xpath("//p[normalize-space()='Annual Procurement Planning']");
    By strategyPaperLink = By.xpath("//p[normalize-space()='Strategy Paper']");
    By requisitionLink = By.xpath("//h2[normalize-space()='Requisition']");
    By purchaseRequisitionLink = By.xpath("//p[normalize-space()='Purchase Requisition']");
    By processOfPurchaseRequisitionLink = By.xpath("//p[contains(text(),'Process of')]");
    By SourcingLink = By.xpath("//h2[normalize-space()='Sourcing']");
    By tenderManagementLink = By.xpath("//p[normalize-space()='Tender Management']");
    By tenderAdministrationLink = By.xpath("//p[normalize-space()='Tender Administration']");
    By tenderEvaluationLink = By.xpath("//p[normalize-space()='Tender Evaluation']");
    By AbortOfTenderLink = By.xpath("//p[normalize-space()='Abort of Tender']");
    By clarificationNegotiationPriorToAwardLink = By.xpath("//p[normalize-space()='Clarification/ Negotiation prior to Award']");
    By contractAdministrationLink = By.xpath("//h2[normalize-space()='Contract Administration']");
    By contractManagementImplementationLink = By.xpath("//p[normalize-space()='Contract Management Implementation']");
    By contractRenewalLink = By.xpath("//p[normalize-space()='Contract Renewal']");
    By contractTerminationLink = By.xpath("//p[normalize-space()='Contract Termination']");
    By contractCloseoutLink = By.xpath("//p[normalize-space()='Contract Closeout']");
    By vendorManagementLink = By.xpath("//h2[normalize-space()='Vendor Management']");
    By vendorRegistrationLink = By.xpath("//p[normalize-space()='Vendor Registration']");
    By potentialVendorScreeningLink = By.xpath("//p[normalize-space()='Potential Vendor Screening']");
    By vendorMgntLink = By.xpath("//p[normalize-space()='Vendor Management']");
    By loginbtn = By.xpath("//button[normalize-space()='Login']");
    By crossbtn = By.xpath("//img[@class='img-close']");
    By mahbContactDirectoryLink = By.xpath("//h2[normalize-space()='MAHB Contact Directory']");
    By procurehereLoginLink = By.xpath("//h2[normalize-space()='Procurehere Login']");
    By vendorManagementSystemLink = By.xpath("//h2[normalize-space()='Vendor Management System']");
    By welcomeToMagpTxt = By.xpath("//h3[text()='Welcome to MAGP']");
    By purchaseIDTxt = By.xpath("//a[text()='Purchase ID']");
    By purchaseIDPopDescTxt = By.xpath("//p[text()='Purchase login ID to access an expanded array of modules and features']");
    By latestAnnouncementsTxt = By.xpath("//h2[text()='Latest Announcements']");
    By last7daysTxt = By.xpath("//p[text()='Last 7 days']");
    By malaysiaLogoIcon = By.xpath("//img[@class='logo me-3']");
    By magpLogoIcon = By.xpath("(//img[contains(@class,'logo-small')])[1]");
    By linkPurchaseID = By.xpath("//a[text()='Purchase ID']");


}
