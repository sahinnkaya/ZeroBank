Feature: Login to Zero Banking App

  Scenario: Logging in with valid credentials
    Given I am on the homepage of the Zero web application
    When I click on the "Sign in" button
    Then I should be directed to the login page
    When I enter the username "username" and password "password" correctly
    And I click on the login button
    Then I should be redirected back to the previous page
    And I should be able to verify that I am logged in by checking for appropriate indicators on the page