@event
Feature: As a user I want to be able to create an event under Event module

  Background: Login as a Help Desk
    Given user is on the login page
    When user logs in as "help desk"
    Given user is on event module

  @simple_event @regression
  Scenario: As a user I want to be able to create a simple event
    When user provides event name and event description
    And user clicks on send button
    Then user should see saved event

    @event_w_location @regression
    Scenario Outline: As a user I want to be able to create an event with different <Event Location>
    When user provides event name and event description
    And user chooses an "<Event location>"
      And user clicks on send button
    Then user should see saved event with "<Event location>"
    Examples:
      | Event location       |
      | Central Meeting Room |
      | West Meeting Room    |
