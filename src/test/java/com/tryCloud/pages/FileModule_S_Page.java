package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileModule_S_Page extends BasePage {

    public FileModule_S_Page() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr[1]/td[2]/a/span[2]/a[2]")
    public WebElement threeDotsIcon;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr[3]/td[2]/a/span[3]/a[2]")
    public WebElement threeDotsIcon2;

    @FindBy(xpath = "//span[text()='Add to favorites']")
    public WebElement addToFavorites;

    @FindBy(xpath = "//span[text()='Rename']")
    public WebElement RenameFile;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div[2]/table/tbody/tr[3]/td[2]/div/ul/li[5]/a/span[2]")
    public WebElement RenameFile2;

    @FindBy(xpath = "//input[@class='filename']")
    public WebElement fileNameInput;

    @FindBy(xpath = "//input[@value='Talk']")
    public WebElement fileNameInput2;
    @FindBy(xpath = "//span[text()='Details']")
    public WebElement Details;
    @FindBy(xpath = "//span[@class='app-sidebar-tabs__tab-icon icon-comment']")
    public WebElement Comment;
    @FindBy(xpath = "//div[@class='message']")
    public WebElement Comment1;
    @FindBy(xpath = "//input[contains(@class, 'submit')]")
    public WebElement Submit;








}