package com.tryCloud.pages;

import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US009_SearchPage {


   public US009_SearchPage() {

       PageFactory.initElements(Driver.getDriver(), this);


   }
    public String module;
   @FindBy(xpath = "//ul[@id='appmenu']/li")
   public List<WebElement>allModules;

   @FindBy(xpath = "//ul[@id='appmenu']/li[2]")
   public WebElement file;

    @FindBy(xpath = "//ul[@id='appmenu']/li[3]")
    public WebElement photos;

    @FindBy(xpath = "//ul[@id='appmenu']/li[4]")
    public WebElement activity;

    @FindBy(xpath = "//ul[@id='appmenu']/li[5]")
    public WebElement talk;

    @FindBy(xpath = "//ul[@id='appmenu']/li[6]")
    public WebElement contacts;

    @FindBy(xpath = "//ul[@id='appmenu']/li[7]")
    public WebElement circles;
    @FindBy(xpath = "//ul[@id='appmenu']/li[8]")
    public WebElement calendar;

    @FindBy(xpath = "//ul[@id='appmenu']/li[9]")
    public WebElement deck;

    @FindBy(xpath = "//a[@aria-controls='header-menu-unified-search']")
    public WebElement search;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@href='http://qa2.trycloud.net/index.php/apps/files/?dir=/&scrollto=Talk']")
    public WebElement searchClick;

    @FindBy(xpath = "//tr[@data-id='56279']")
    public WebElement fileverification;

   @FindBy(xpath = "//div[@class='app-sidebar-tabs']")
    public WebElement rightSide;

   @FindBy(id = "nextcloud")
    public WebElement appIcon;







}
