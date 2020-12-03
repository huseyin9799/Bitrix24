# new feature
# Tags: optional

Feature: Login feature

  @parametrized_login @regression
  Scenario: Login as help desk
    Given user is on the login page
    When user logs in as "help desk"
    Then user should see Activity Stream