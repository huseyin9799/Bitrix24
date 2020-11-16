Feature: As a user I want to be able to create an poll under poll module

  Background: Login as a Help Desk
    Given user is on the login page
    When user logs in as "help desk"

  @poll
  Scenario Outline: As a user I want to be able to create a simple poll
    Given user is on poll module
    When user enter message into message box "<Message>"
    And user enter question "<Question>"
    And user enter "<Answer1>" and "<Answer2>"
    And user clicks on send  button in Poll tab
    Then user should see saved poll
    Examples:
      | Message        | Question               | Answer1 | Answer2  |
      | Hello Group 17 | How was Vasyl's class? | Good    | Not Good |