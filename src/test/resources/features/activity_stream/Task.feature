Feature: As a user I want to be able to create Task
  Background: Login as a Help Desk
    Given user is on the login page
    When user logs in as "help desk"

  @Task @regression
  Scenario: As a user I want to be able to create a simple task
    Given user is on task module
    When user provides task title's name and task's description
    And  user clicks on send blue button
    Then user should see saved task
