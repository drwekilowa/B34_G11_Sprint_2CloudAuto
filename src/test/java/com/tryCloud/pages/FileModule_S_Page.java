package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileModule_S_Page extends BasePage {

    public FileModule_S_Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[2]/a/span[3]/a[2]")
    public WebElement threeDotsMenu;


    @FindBy(xpath = "//span[text()='Add to favorites']")
    public WebElement addToFavorites;
}