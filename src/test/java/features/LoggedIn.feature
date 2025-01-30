Feature: LoggedIn User View
  Scenario: Validate User is able to view after login
    Given User navigate to login page
    When User successfully enters the login details
    Then User should be able to view product category page