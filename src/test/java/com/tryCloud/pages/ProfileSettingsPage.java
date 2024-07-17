package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettingsPage {

    public ProfileSettingsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "settings")
    public WebElement settings;

    @FindBy(xpath = "//li[@data-id = 'settings']")
    public WebElement settings_link;

    @FindBy(xpath = "//div[@class='icon-menu']")
    public WebElement profile_menu;


    @FindBy(xpath = "//label[.= 'Full name']")
    public WebElement fullName_Display;

    @FindBy(xpath = "//label[.= 'Email']")
    public WebElement email_Display;

    @FindBy(xpath = "//label[.= 'Phone number']")
    public WebElement phoneNumber_Display;

    //Scenario 2 locators

    @FindBy(id = "displayname")
    public WebElement displayName;

    @FindBy(xpath = "//span[@title='User7']")
    public WebElement user_Display;

    //Scenario 3  locators

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phoneNumberInput;

















}
