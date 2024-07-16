package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkModulePage extends BasePage{
    public TalkModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "spreed")
    public WebElement talkButton;

    @FindBy(xpath = "//a[@class='app-navigation-toggle']")
    public WebElement hamburgerIcon;

    @FindBy(xpath = "//button[@class='toggle has-tooltip']")
    public WebElement plusButton;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement inputConversationBox;

    @FindBy(xpath = "//label[@for='checkbox']")
    public WebElement checkBox;


}
