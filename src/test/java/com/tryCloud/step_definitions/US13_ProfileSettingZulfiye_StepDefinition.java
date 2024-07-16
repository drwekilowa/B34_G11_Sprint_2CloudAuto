package com.tryCloud.step_definitions;

import com.tryCloud.pages.LoginPage;
import com.tryCloud.pages.ProfileSettingsPage;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class US13_ProfileSettingZulfiye_StepDefinition extends LoginPage {

    LoginPage loginPage = new LoginPage();
    ProfileSettingsPage profileSettingsPage = new ProfileSettingsPage();


    //@B34G11-159
    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        loginPage.login("User7","Userpass123");
    }

    @When("the user navigates to the Profile Settings page")
    public void the_user_navigates_to_the_profile_settings_page() {
        profileSettingsPage.settings.click();
        profileSettingsPage.settings_link.click();

    }

    @Then("the user should see Personal Info section")
    public void theUserShouldSeePersonalInfoSection() {
        profileSettingsPage.profile_menu.click();
    }

    @And("the user should see Full name title in the Personal Info section")
    public void theUserShouldSeeFullNameTitleInThePersonalInfoSection() {
        String actualTitle = profileSettingsPage.fullName_Display.getText();
        String expectedTitle = "Full name";
        assertEquals(expectedTitle, actualTitle);
    }

    @And("the user should see Email title in the Personal Info section")
    public void theUserShouldSeeEmailTitleInThePersonalInfoSection() {
        String actualTitle = profileSettingsPage.email_Display.getText();
        String expectedTitle = "Email";
        assertEquals(expectedTitle, actualTitle);

    }

    @And("the user should see Phone Number title in the Personal Info section")
    public void theUserShouldSeePhoneNumberTitleInThePersonalInfoSection() {
        String actualTitle = profileSettingsPage.phoneNumber_Display.getText();
        String expectedTitle = "Phone number";
        assertEquals(expectedTitle, actualTitle);
    }



    //@B34G11-160


    @Then("the user should see the Full Name input box")
    public void the_user_should_see_the_full_name_input_box() {
        profileSettingsPage.displayName.getText();
    }
    @Then("the user should see the Settings field with the user's name")
    public void the_user_should_see_the_settings_field_with_the_user_s_name() {
        profileSettingsPage.settings.click();
        profileSettingsPage.user_Display.getText();
    }

    @Then("the name in the Settings field should match the Full Name input box")
    public void the_name_in_the_settings_field_should_match_the_full_name_input_box() {
        // Get the text from the Full Name input box
        String fullName = profileSettingsPage.displayName.getText();

        // Get the text from the Settings field
        String settingsName = profileSettingsPage.settings.getText();

        // Assert that both texts are equal
        Assert.assertEquals(fullName, settingsName, "The name in the Settings field does not match the Full Name input box.");

    }


    //@B34G11-161


    @Then("the user should see the Phone Number input box")
    public void the_user_should_see_the_phone_number_input_box() {
        profileSettingsPage.settings.click();
        profileSettingsPage.profile_menu.click();
       profileSettingsPage.phoneNumber_Display.click();
    }
    @When("the user enters {string} into the Phone Number input box")
    public void the_user_enters_into_the_phone_number_input_box(String input) {
        profileSettingsPage.phoneNumberInput.clear();
        profileSettingsPage.phoneNumberInput.sendKeys(input);
    }

    @Then("the Phone Number input box should contain {string}")
    public void the_phone_number_input_box_should_contain(String expectedValue) {
        String actualValue = profileSettingsPage.phoneNumberInput.getAttribute("value");
        assertEquals(expectedValue, actualValue);

    }



}
