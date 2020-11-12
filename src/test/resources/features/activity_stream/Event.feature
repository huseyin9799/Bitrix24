Feature: As a user I want to be able to create an event under Event module

  Background: Login as a Help Desk
    Given user is on the login page
    When user logs in as "help desk"

  @event
  Scenario: As a user I want to be able to create a simple event
    Given user is on event module
    When user provides event name and event description
    And user clicks on send button
    Then user should see saved event
