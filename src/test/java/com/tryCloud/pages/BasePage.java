package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@data-id='files']")
    public WebElement fileLinkModule;

    @FindBy(xpath = "//a[@aria-label='Dashboard']")
    public WebElement dashboardLinkModule;

    @FindBy(xpath = "//a[@aria-label='Photos']")
    public WebElement photosLinkModule;

    @FindBy(xpath = "//a[@aria-label='Activity']")
    public WebElement activityLinkModule;

    @FindBy(xpath = "//a[@aria-label='Talk']")
    public WebElement talkLinkModule;

    @FindBy(xpath = "//a[@aria-label='Contacts']")
    public WebElement contactsLinkModule;

    @FindBy(xpath = "//a[@aria-label='Circles']")
    public WebElement circlesLinkModule;

    @FindBy(xpath = "//a[@aria-label='Calendar']")
    public WebElement calendarLinkModule;

    @FindBy(xpath = "//a[@aria-label='Deck']")
    public WebElement deskLinkModule;

    @FindBy(xpath = "//a[@aria-controls='header-menu-unified-search']")
    public WebElement generalSearch;

    @FindBy(xpath = "//div[@aria-label='Notifications']")
    public WebElement notificationBtn;


    @FindBy(xpath = "//div[@class='icon-contacts menutoggle']")
    public WebElement contactSearch;


    @FindBy(xpath = "//div[@class='menutoggle']")
    public WebElement userLogo;





    // this method is only useful for module links
    public void dynamicLinkElement(String text){

        String locator ="//a[@aria-label=('"+text+"')]";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));

        Assert.assertTrue("DynamicLinkElement method Failed!",element.isDisplayed());
    }

    public void navigateTo(String url){
        System.out.println("Navigate to "+ url);
    }

}
