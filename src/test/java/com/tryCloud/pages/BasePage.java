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


    @FindBy(css = "a.active")
    public WebElement dashboardLink;

    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement filesLink;

    @FindBy(xpath = "//a[@aria-label='Photos']")
    public WebElement photosLink;

    @FindBy(xpath = "//a[@aria-label='Activity']")
    public WebElement activityLink;

    @FindBy(xpath = "//a[@aria-label='Talk']")
    public WebElement talkLink;

    @FindBy(xpath = "//a[@aria-label='Contacts']")
    public WebElement contactsLink;

    @FindBy(xpath = "//a[@aria-label='Circles']")
    public WebElement circlesLink;

    @FindBy(xpath = "//a[@aria-label='Calendar']")
    public WebElement calendarLink;

    @FindBy(xpath = "//a[@aria-label='Deck']")
    public WebElement deskLink;

    @FindBy(xpath = "//a[@aria-controls='header-menu-unified-search']")
    public WebElement generalSearchBtn;

    @FindBy(xpath = "//div[@aria-label='Notifications']")
    public WebElement notifications;

    @FindBy(xpath = "//div[@class='icon-contacts menutoggle']")
    public WebElement contactsSearchBtn;


    @FindBy(xpath = "//div[@class='menutoggle']")
    public WebElement userIcon;

// this method is only useful for module links
    public void dynamicLinkElement(String text){

        String locator ="//a[@aria-label=('"+text+"')]";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));

        Assert.assertTrue("DynamicLinkElement method Failed!",element.isDisplayed());
    }

}
