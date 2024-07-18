package com.tryCloud.step_definitions;

import com.tryCloud.pages.ProfileSettingsPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class US14_Profile_Settings_StepDefinitions_Zeynep {

    ProfileSettingsPage profileSettingsPage = new ProfileSettingsPage();

    @When("the user clicks the Profile module")

    public void the_user_clicks_the_profile_module() {

        profileSettingsPage.profileModule.click();
    }

    @When("the user clicks the profile settings")

    public void the_user_clicks_the_profile_settings() {

        profileSettingsPage.profileSettings.click();

    }

    @Then("the full name displayed in the Full name input box should be the same as {string}")
    public void the_full_name_displayed_in_the_full_name_input_box_should_be_the_same_as(String string) {

        String fullName = profileSettingsPage.fullNameBox.getAttribute("value");

        Assert.assertEquals(ConfigurationReader.getProperty("username"), fullName);
    }

    @When("the user enters {string} in the Email input box and hit the enter")

    public void the_user_enters_in_the_email_input_box_and_hit_the_enter(String validEmail) {

        profileSettingsPage.emailBox.clear();
        profileSettingsPage.emailBox.sendKeys(validEmail + Keys.ENTER);
    }

    @Then("the Email input box should display {string}")
    public void the_email_input_box_should_display(String string) {

        WebElement expectedEmail = profileSettingsPage.emailBox;


        Assert.assertTrue(expectedEmail.isDisplayed());


    }

    @When("User selects a different language {string}")
    public void user_selects_a_different_language(String new_language) throws InterruptedException {

        Select dropdown = new Select(profileSettingsPage.languageDropdown);



        dropdown.selectByVisibleText(new_language);
        BrowserUtils.sleep(3);
    }

    @Then("Language should be changed to {string} successfully")
    public void language_should_be_changed_to_successfully(String new_language) throws InterruptedException {

        Select dropdown = new Select(profileSettingsPage.languageDropdown);
        String selectedLanguage = dropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(new_language, selectedLanguage);



    }

    }

