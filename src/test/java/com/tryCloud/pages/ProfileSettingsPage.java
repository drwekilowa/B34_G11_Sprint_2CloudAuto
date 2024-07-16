package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettingsPage {
    public ProfileSettingsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[@id='expand']")
    public WebElement profileModule;

    @FindBy(xpath = "//li[@data-id='settings']")
    public WebElement profileSettings;

    @FindBy(xpath = "//input[@id='displayname']")
    public WebElement fullNameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;


    @FindBy(xpath = "//select[@id='languageinput']")
    public WebElement languageDropdown;








}

