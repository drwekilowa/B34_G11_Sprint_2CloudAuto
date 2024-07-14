package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class CalendarModulePage {

    public CalendarModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@aria-label='Calendar']")
    public WebElement calendarLinkModule;

    @FindBy(xpath = "//button[@aria-label='Actions']")
    public WebElement calendarMenuButton;

    @FindBy(xpath = "//li[@class='action active']")
    public WebElement dayButton;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-week']")
    public WebElement weekButton;

    @FindBy(xpath = "(//button[@class='action-button focusable'])[8]")
    public WebElement monthButton;


    @FindBy(xpath = "(//div[@class='app-navigation-entry__icon-bullet-disabled'])[1]")
    public WebElement personalRadioButtonSelection;


    //Finding NEW EVENT Locators -----------------------------

    @FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement newEventButton;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement newEventInputText;


    //new event FROM locators -------->

    @FindBy(xpath = "(//input[@name='date'])[2]")
    public WebElement fromSelectButton;

    @FindBy(xpath = "//td[@title='2024-07-22']")
    public WebElement fromDateSelection;

    @FindBy(xpath = "(//li[@data-index='8'])[1]")
    public WebElement fromHourSelection;

    @FindBy(xpath = "(//li[@data-index='3'])[2]")
    public WebElement fromMinutesSelection;

    @FindBy(xpath = "(//li[@data-index='0'])[3]")
    public WebElement fromTimeOfDaySelection;


    //new event TO locators -------->

    @FindBy(xpath = "(//input[@name='date'])[3]")
    public WebElement toSelectButton;

    @FindBy(xpath = "//td[@title='2024-07-22']")
    public WebElement toDateSelection;

    @FindBy(xpath = "(//li[@data-index='10'])[1]")
    public WebElement toHourSelection;

    @FindBy(xpath = "(//li[@data-index='8'])[2]")
    public WebElement toMinutesSelection;

    @FindBy(xpath = "(//li[@data-index='0'])[3]")
    public WebElement toTimeOfDaySelection;

    // SAVE button -------->

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement saveEventButton;


    // Viewing created EVENT with Monthly Calendar Mode

    @FindBy(xpath = "//button[@aria-label='Actions']")
    public WebElement calendarMenuButtonEvent;

    @FindBy(xpath = "(//button[@class='action-button focusable'])[8]")
    public WebElement monthButtonEvent;




















}
