package com.tryCloud.step_definitions;

import com.tryCloud.pages.TalkModulePage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class TalkModule_StepDefinition {
    TalkModulePage talkModulePage= new TalkModulePage();
    Actions actions = new Actions(Driver.getDriver());
    @When("Users click Talk button")
    public void users_click_talk_button() {
    talkModulePage.talkButton.click();
    }


    @Then("Users click hamburger icon")
    public void usersClickHamburgerIcon() {

        talkModulePage.hamburgerIcon.click();
    }

    @Then("Users  click plus button")
    public void users_click_plus_button() {
        talkModulePage.plusButton.click();

    }
    @Then("Users should create  conversation name")
    public void users_should_create_conversation_name() {

        BrowserUtils.sleep(3);
        talkModulePage.conversationBox.sendKeys("Group11");

    }
    @Then("Users click Allow guests to join via link")
    public void users_click_allow_guests_to_join_via_link() {
        BrowserUtils.sleep(3);
        talkModulePage.checkBox.click();

    }
    @Then("Users should click Add participants button")
    public void users_should_click_add_participants_button() {
        BrowserUtils.sleep(3);
        talkModulePage.addButton.click();

    }
    @When("Users select Employee10")
    public void users_select_employee10() {
        BrowserUtils.sleep(3);
       actions.moveToElement(talkModulePage.employee10).click().perform();

    }
    @Then("Users  should click Create conversation")
    public void users_should_click_create_conversation() {
        BrowserUtils.sleep(3);
        talkModulePage.createButton.click();

    }
    @Then("Users should see displayed message All set")
    public void users_should_see_displayed_message_all_set() {
        BrowserUtils.sleep(3);
        talkModulePage.displayedMessage.isDisplayed();

    }
    @When("Users click Close button")
    public void users_click_close_button() {
        talkModulePage.closeButton.click();

    }
    @Then("Users should see new conversation in the list")
    public void users_should_see_new_conversation_in_the_list() {
        BrowserUtils.sleep(3);
        talkModulePage.hamburgerIcon.click();
        talkModulePage.conversationList.isDisplayed();

    }
    @Given("Users on the conversation list page")
    public void users_on_the_conversation_list_page() {
        BrowserUtils.sleep(3);
        talkModulePage.hamburgerIcon.click();


    }

    @Then("Users click ellipsis button")
    public void users_click_button() {
        BrowserUtils.sleep(3);
        actions.moveToElement(talkModulePage.ellipsisButton).click().perform();
    }
    @Then("Users navigate Delete conversation and click")
    public void users_navigate_delete_conversation_and_click() {
        BrowserUtils.sleep(3);
      talkModulePage.deleteButton.click();

    }
    @Then("Users should see displayed message Delete conversation")
    public void users_should_see_displayed_message_delete_conversation() {
        BrowserUtils.sleep(3);
        talkModulePage.warningDisplayed.isDisplayed();

    }
    @Then("Users click Yes button")
    public void users_click_yes_button() {
        BrowserUtils.sleep(3);
        actions.moveToElement(talkModulePage.yesButton).click().perform();


    }


}
