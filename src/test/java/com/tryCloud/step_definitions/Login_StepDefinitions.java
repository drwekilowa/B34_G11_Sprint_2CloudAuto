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
//
//    @Given("user is on the login page")
//    public void user_is_on_the_login_page() {
//
//        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//
//    }
//
//    @When("user enters the user information")
//    public void user_enters_the_user_information() {
//
//        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
//
//        loginPage.loginBtn.click();
//
//    }
//
//    @Then("user should be able to login")
//    public void user_should_be_able_to_login() {
//
//        BrowserUtils.waitForTitleContains("Files - Login");
//        Assert.assertEquals("Title verification is FAILED", "Files - Login", Driver.getDriver().getTitle());
//
//    }
//
//    @Given("employee is on the login page")
//    public void employee_is_on_the_login_page() {
//
//        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//
//
//    }
//
//    @When("employee enters the employee information")
//    public void employee_enters_the_employee_information() {
//
//        loginPage.login(ConfigurationReader.getProperty("employee_username"), ConfigurationReader.getProperty("employee_password"));
//        loginPage.loginBtn.click();
//
//    }
//
//    @Then("employee should be able to log")
//    public void employee_should_be_able_to_log() {
//
//        BrowserUtils.waitForTitleContains("Files - Login");
//        Assert.assertEquals("Title verification is FAILED", "Files - Login", Driver.getDriver().getTitle());
//
//    }
//
//
//    @When("user enters the employee information")
//    public void user_enters_the_employee_information() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
//
//    }
//
//    @Then("user should be able to log")
//    public void user_should_be_able_to_log() {
//
//        loginPage.login(ConfigurationReader.getProperty("employee_username"), ConfigurationReader.getProperty("employee_password"));
//
//    }
//
//    @Given("user is on the login page")
//    public void userIsOnTheLoginPage() {
//
//        BrowserUtils.waitForTitleContains("Dashboard - Trycloud");
//        Assert.assertEquals("Title verification for employee is FAILED", "Dashboard - Trycloud", Driver.getDriver().getTitle());
//    }



    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }
    @When("user logged in as {string}")
    public void user_logged_in_as(String string) {
//       loginPage.loginUser.sendKeys(ConfigurationReader.getProperty("username"));
//       loginPage.loginPass.sendKeys(ConfigurationReader.getProperty("password"));
//       loginPage.loginBtn.click();

        loginPage.login(string);


    }

    @When("user enters the user information")
    public void userEntersTheUserInformation() {
    }

    @Then("user should be able to login")
    public void userShouldBeAbleToLogin() {
    }



    @When("user enters the employee information")
    public void userEntersTheEmployeeInformation() {
    }

    @Then("user should be able to log")
    public void userShouldBeAbleToLog() {
    }
  }
