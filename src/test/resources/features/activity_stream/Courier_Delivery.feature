Feature: As help desk, user should be able to submit courier delivery form

  Background: Login as help desk
    Given user is on the login page
    When user logs in as "help desk"

  @courier_delivery
  Scenario: Submit a courier delivery form with valid data
    Given user is on the courier delivery form
    When user enters valid data in each field
      |Collection Date |03/03/2021        |
      |Delivery Address|1125 Liyue Dr     |
      |Weight          |51                |
      |Description     |Package arrived!  |
      |Comment         |Important package |
    And clicks "submit order" button
    Then user should see the order created at the top of My Orders page