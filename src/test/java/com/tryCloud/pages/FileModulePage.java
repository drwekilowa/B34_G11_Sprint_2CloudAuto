package com.tryCloud.pages;

import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.util.List;

public class FileModulePage extends BasePage {

public FileModulePage () {

    PageFactory.initElements(Driver.getDriver(), this);
}
    @FindBy(xpath = "//span[.='New']/..")
  public WebElement plusIcon;

    @FindBy(id = "file_upload_start")
    public WebElement uploadFile;


@FindBy (xpath = "//span[.='Upload file']")
    public WebElement uploadFileOption;

@FindBy(xpath = "//span[.='New folder']")
    public WebElement newFolderOption;

@FindBy(id = "view13-input-folder")
    public WebElement inputBox;

@FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement arrow;

@FindBy (xpath = "//span[@class='dirinfo']")
    public WebElement folderNumber;

@FindBy(xpath = "//span[@class='fileinfo']")
    public WebElement fileNumber;

@FindBy(xpath = "//a[@class='action action-menu permanent']//span")
    public WebElement threeDotsFile;

@FindBy (xpath = "//span[.='Delete folder']")
    public WebElement deleteFileOption;

@FindBy(xpath = "//div[@class='newFileMenu popovermenu bubble menu open menu-left']")
    public List<WebElement> plusButtonOptions;

@FindBy(xpath = "//span[.='Document']")
    public WebElement documentFileTxt;

@FindBy(xpath = "//span[.='new folder22']//span")
    public WebElement newFolder22;

@FindBy(xpath = "//span[@class='icon icon-more']")
    public WebElement documentTxtDot;




    public void uploadFileDynamic(String fileName) {
        String fileSeparator = System.getProperty("file.separator");
        String path = System.getProperty("user.dir") + fileSeparator + "src/test/resources/uploadedFiles" + fileSeparator + fileName;
        BrowserUtils.sleep(3);
       uploadFile.sendKeys(path);
       BrowserUtils.sleep(2);

    }
}
