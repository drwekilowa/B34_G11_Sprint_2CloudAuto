package com.tryCloud.step_definitions;

import com.tryCloud.pages.TalkModulePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TalkModule_StepDefinition {
    TalkModulePage talkModulePage= new TalkModulePage();
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


    }
    @Then("Users click Allow guests to join via link")
    public void users_click_allow_guests_to_join_via_link() {

    }
    @Then("Users should click Add participants button")
    public void users_should_click_add_participants_button() {

    }

}
