package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeckModulePage extends BasePage {
    public DeckModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="Deck")
    public WebElement deckButton;


}
