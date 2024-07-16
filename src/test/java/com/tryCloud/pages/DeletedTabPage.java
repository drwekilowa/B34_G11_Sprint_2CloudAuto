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

    @FindBy(xpath = "//tbody[@id='fileList']/tr")
    public List<WebElement> deletedFiles;

    @FindBy(xpath = "/html/body/div[3]/div[2]/div[14]/table/tbody/tr[1]/td[2]/a/span[2]/a[2]")
    public WebElement threeDotsIcon;

    @FindBy(xpath = "//a[@data-action='Delete']")
    public WebElement deletePermanentlyButton;

    @FindBy(xpath = "//span[.=' Restore']")
    public List<WebElement> restoreButton;

    @FindBy(xpath = "//a[.=\"All files\"]")
    public WebElement allFilesTab;
}


