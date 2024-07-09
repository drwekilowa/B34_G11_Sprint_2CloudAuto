package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement loginUser;

    @FindBy(id = "password")
    public WebElement loginPass;

    @FindBy(id = "submit")
    public WebElement loginBtn;

    public void login(String username, String password) {
        loginUser.sendKeys(username);
        loginPass.sendKeys(password);
        loginBtn.click();
    }
}
