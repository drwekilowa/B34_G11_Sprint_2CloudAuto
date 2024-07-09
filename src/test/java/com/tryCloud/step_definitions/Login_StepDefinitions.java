package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {
    LoginPage loginPage = new LoginPage();

    @When("user enters the user information")
    public void user_enters_the_user_information() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Then("user should be able to login")
    public void user_should_be_able_to_login() {

//        loginPage.loginUser.sendKeys("username");
//        loginPage.loginPass.sendKeys("password");
        loginPage.login("username","password");

    }

    @When("user enters the employee information")
    public void user_enters_the_employee_information() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Then("user should be able to log")
    public void user_should_be_able_to_log() {

   loginPage.login(ConfigurationReader.getProperty("employee_username"),ConfigurationReader.getProperty("employee_password"));

    }

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {

        BrowserUtils.waitForTitleContains("Files - Login");
        Assert.assertEquals("Title verification is FAILED", "Files - Login", Driver.getDriver().getTitle());
    }
}
