package com.tryCloud.pages;

import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US009_SearchPage extends BasePage {


   public US009_SearchPage() {

       PageFactory.initElements(Driver.getDriver(), this);


   }
    @FindBy(xpath = "//tr[@data-id='56281']")
    public WebElement fileverification;

   @FindBy(xpath = "//div[@class='app-sidebar-tabs']")
    public WebElement rightSide;







}
