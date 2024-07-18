@DeckModule
Feature: Deck Module Functionality

  User Story: As a user, I should be able to manage my works by creating a new board/list/card and modifying them under Deck Module.

  Acceptance Criteria
  User can create a new board
  User can create a new list of card/task under any board
  User can add a new card/task on any list on the current board
  User can assign any card/task to himself/herself by using the three dots on the related card

  Background:
    Given user is on the login page
    When user logged in as "user"

  @AddBoardDeck
  Scenario: User can create a new board under deck module and modify
    When User clicks on deck button
    And User opens deck tab
    And User clicks add board button
    And User types a title
    And User can see new board
    Then User can modify the board


