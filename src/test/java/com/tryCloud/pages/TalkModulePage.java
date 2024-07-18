package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkModulePage extends BasePage {
    public TalkModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//a[@href='http://qa2.trycloud.net/index.php/apps/spreed/'])[1]")
    public WebElement talkButton;

    @FindBy(xpath = "//a[@class='app-navigation-toggle']")
    public WebElement hamburgerIcon;

    @FindBy(xpath = "//button[@class='toggle has-tooltip']")
    public WebElement plusButton;

    @FindBy(xpath = "//input[@class='conversation-name']")
    public WebElement conversationBox;

    @FindBy(xpath = "//label[@class='conversation-type__label']")
    public WebElement checkBox;

    @FindBy(xpath = "//div[@class='navigation']")
    public WebElement addButton;

    @FindBy(xpath = "//li[.//img[@src='/index.php/avatar/Employee10/44']]")
    public WebElement employee10;

    @FindBy(xpath = "(//button[@class='navigation__button navigation__button-right primary'])")
    public WebElement createButton;

    @FindBy(className = "confirmation__warning")
    public WebElement displayedMessage;

    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement closeButton;

    @FindBy(partialLinkText = "Group11")
    public WebElement conversationList;

    @FindBy(xpath = "(//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[1]")
    public WebElement ellipsisButton;

    @FindBy(xpath = "//span[.='Delete conversation']")
    public WebElement deleteButton;

    @FindBy(xpath ="//h2[.='Delete conversation ']" )
    public WebElement warningDisplayed;

    @FindBy(xpath = "(//button[@class='primary'])[1]")
    public WebElement yesButton;



}
