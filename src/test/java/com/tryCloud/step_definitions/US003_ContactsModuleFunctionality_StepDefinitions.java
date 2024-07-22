package com.tryCloud.step_definitions;

import com.tryCloud.pages.ContactsPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class US003_ContactsModuleFunctionality_StepDefinitions {

    ContactsPage contactsPage = new ContactsPage();

    @When("user clicks on Contacts module icon")
    public void user_clicks_on_contacts_module_icon() {

        contactsPage.contactsModuleIcon.click();
    }

    @And("user clicks on Create contact button")
    public void user_clicks_on_create_contact_button() {

        contactsPage.createContactsButton.click();
    }

    @And("user enters {string} into New Contact text area")
    public void user_enters_into_new_contact_text_area(String name) {

        contactsPage.contactName.clear();
        contactsPage.contactName.sendKeys(name);
    }

    @And("user enters {string} into Company text area")
    public void user_enters_into_company_text_area(String companyName) {

        contactsPage.contactCompany.sendKeys(companyName);
    }

    @And("user enters {string} into Title text area")
    public void user_enters_into_title_text_area(String title) {

        contactsPage.contactTitle.sendKeys(title);
    }

    @And("user enters {string} into Home Phone number text box")
    public void user_enters_into_home_phone_number_text_box(String phoneNumber) {

        contactsPage.contactPhone.sendKeys(phoneNumber);
    }

    @And("user enters {string} into Home email text box")
    public void user_enters_into_home_email_text_box(String email) {

        contactsPage.contactEmail.sendKeys(email);
    }

    @And("user enters {string} into Address text box")
    public void user_enters_into_address_text_box(String address) {

        contactsPage.contactAddress.sendKeys(address);
    }

    @And("user enters {string} into Postal code")
    public void user_enters_into_postal_code(String postalCode) {

        contactsPage.contactPostalCode.sendKeys(postalCode);
    }

    @And("user enters {string} into City text box")
    public void user_enters_into_city_text_box(String city) {

        contactsPage.contactCity.sendKeys(city);
    }

    @And("user enters {string} into State or province text box")
    public void user_enters_into_state_or_province_text_box(String stateOrProvince) {

        contactsPage.contactStateOrProvince.sendKeys(stateOrProvince);
    }

    @And("user enters {string} into Country text box")
    public void user_enters_into_country_text_box(String country) {

        contactsPage.contactCountry.sendKeys(country);
    }

    @And("user clicks on the Contacts module icon again")
    public void user_clicks_on_the_contacts_module_icon_again() {

        BrowserUtils.waitFor(10);
        contactsPage.contactsModuleIcon.click();
    }

    @Then("user should see {string} is displayed")
    public void userShouldSeeIsDisplayed(String name) {

       contactsPage.contactName.isDisplayed();
    }

    @Then("user sees {string} displayed in a list in middle column")
    public void userSeesDisplayedInAListInMiddleColumn(String name) {

        Assert.assertTrue(contactsPage.contactDisplayed.getText().contains(name));
    }



    @Then("user sees total number of contacts near All contacts tab")
    public void userSeesTotalNumberOfContactsNearAllContactsTab() {

        contactsPage.numberOfContactsDisplayed.isDisplayed();
    }

    @And("user clicks on the new existing contact")
    public void userClicksOnTheNewExistingContact() {

        contactsPage.contactDisplayed.click();
    }

    @And("user is navigated back to the new existing contact's info page and clicks the ellipsis icon")
    public void userIsNavigatedBackToTheNewExistingContactSInfoPageAndClicksTheEllipsisIcon() {

        WebElement ellipsisButton = Driver.getDriver().findElement(By.xpath("//div[//button[@class=\"icon action-item__menutoggle action-item__menutoggle--default-icon\"]]"));
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].style.visibility = 'visible';", ellipsisButton);

        BrowserUtils.scrollToElement(contactsPage.ellipsisButton);
        BrowserUtils.clickWithJS(contactsPage.ellipsisButton);
    }

    @And("user clicks delete button")
    public void userClicksDeleteButton() {

        BrowserUtils.scrollToElement(contactsPage.deleteContactButton);
        BrowserUtils.clickWithJS(contactsPage.deleteContactButton);
    }

    @Then("user's new contact {string} is deleted")
    public void userSNewContactIsDeleted(String name) {


    }
}
