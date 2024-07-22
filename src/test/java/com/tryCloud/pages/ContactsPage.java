package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {


    public ContactsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='contact-fullname']")
    public WebElement contactName;

    @FindBy(xpath = "//input[@id='contact-org']")
    public WebElement contactCompany;

    @FindBy(xpath = "//input[@id='contact-title']")
    public WebElement contactTitle;

    @FindBy(xpath = "//input[@inputmode='tel']")
    public WebElement contactPhone;

    @FindBy(xpath = "//input[@inputmode='email']")
    public WebElement contactEmail;

    @FindBy(xpath = "//div[@class=\"property__label\" and contains(text(), \"Address\")]/following-sibling::input[@type=\"text\"]\n")
    public WebElement contactAddress;

    @FindBy(xpath = "//div[@class=\"property__label\" and contains(text(), \"Postal code\")]/following-sibling::input[@type=\"text\"]\n")
    public WebElement contactPostalCode;

    @FindBy(xpath = "//div[@class=\"property__label\" and contains(text(), \"City\")]/following-sibling::input[@type=\"text\"]\n")
    public WebElement contactCity;

    @FindBy(xpath = "//div[@class=\"property__label\" and contains(text(), \"State or province\")]/following-sibling::input[@type=\"text\"]\n")
    public WebElement contactStateOrProvince;

    @FindBy(xpath = "//div[@class=\"property__label\" and contains(text(), \"Country\")]/following-sibling::input[@type=\"text\"]\n")
    public WebElement contactCountry;

    @FindBy(css = "a[href='/index.php/apps/contacts/']")
    public WebElement contactsModuleIcon;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement createContactsButton;

    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
    public WebElement contactDisplayed;

    @FindBy(xpath = "//div[@class='app-navigation-entry__counter']")
    public WebElement numberOfContactsDisplayed;

    @FindBy(xpath = "//button[@class=\"icon action-item__menutoggle action-item__menutoggle--default-icon\"]")
    public WebElement ellipsisButton;

    @FindBy(xpath = "//button[@class=\"action-button focusable\"]")
    public WebElement deleteContactButton;












}
