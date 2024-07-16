package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeletedTabPage {


    public DeletedTabPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedFileTab;

    @FindBy(xpath = "//span[.='Deleted']")
    public WebElement deletedButtonSort;

    @FindBy(id = "fileList")
    public List<WebElement> deletedFiles;

    @FindBy(xpath = "//span[@class='icon icon-more']")
    public List<WebElement> threeDotsIcon;

    @FindBy(xpath = "//li[@class=' action-delete-container']")
    public WebElement deletePermanentlyButton;

    @FindBy(xpath = "//span[@class=\"icon icon-history\"]")
    public List<WebElement> restoreButton;

    @FindBy(xpath = "//a[.=\"All files\"]")
    public WebElement allFilesTab;
}


