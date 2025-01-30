Feature: New User Registration View
  Scenario: Validate new user is able to view after clicking on new registration
    Given User navigate to login page
    When User click on new Registration button
    Then User should be able to view the registration page