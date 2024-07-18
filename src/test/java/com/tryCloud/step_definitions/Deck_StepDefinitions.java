package com.tryCloud.step_definitions;

import com.tryCloud.pages.DeckModulePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Deck_StepDefinitions {
    DeckModulePage deckModulePage = new DeckModulePage();
    @When("User clicks on deck button")
    public void user_click_deck_button(){
        deckModulePage.deckButton.click();
    }

    @And("User clicks add board button")
    public void userClicksAddBoardButton() {
        deckModulePage.addBoard.click();
    }

    @And("User types a title")
    public void userTypesATitle() {

    }

    @And("User can see new board")
    public void userCanSeeNewBoard() {

    }

    @Then("User can modify the board")
    public void userCanModifyTheBoard() {
    }

    @And("User opens deck tab")
    public void userOpensDeckTab() {
        deckModulePage.boardList.click();
    }
}
