package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@data-id='files']")
    public WebElement fileModule;

// this method only useful module links
    public void dynamicLinkElement(String text){

        String locator ="//a[@aria-label=('"+text+"')]";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));

        Assert.assertTrue("DynamicLinkElement method Failed!",element.isDisplayed());
    }

}
