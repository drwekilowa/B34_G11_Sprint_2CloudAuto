package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US010_FilesPage {
    public US010_FilesPage() {
        PageFactory.initElements(Driver.getDriver() , this);
    }

    @FindBy(xpath = "//tbody[@id='fileList']/tr/td[2]")
    public List<WebElement> filesName;

    @FindBy(xpath = "//div[@id='headerName-container']/a")
    public WebElement nameButton;

    @FindBy(xpath = "//tbody[@id='fileList']/tr/td[3]")
    public List<WebElement> filesSize;

    @FindBy(xpath = "//th[@id='headerSize']/a")
    public WebElement sizeButton;

    @FindBy(xpath = "//tbody[@id='fileList']/tr/td[4]")
    public List<WebElement> filesDate;

    @FindBy(xpath = "//th[@id='headerDate']/a")
    public WebElement modifiedButton;

    @FindBy(xpath = "//th[@id='headerSelection']")
    public WebElement allFilesButton;

    @FindBy(xpath = "//div[@id='headerName-container']/a")
    public WebElement totalFilesMsg;

    @FindBy(xpath = "//tbody[@id='fileList']//tr/td[1]/input")
    public List<WebElement> checkboxes;

}
