Feature:

  Background:
    Given I navigate to the Zero bank page
    When I click on Signin link
    And I enter valid login and user name
      |username|
      |password|
    And I click on the Sing in button

  Scenario:
    Then I navigate to the element Online Banking -> More Services
    And I click the Pay Bills link
    And I choose Purchase Foreign Currency link
    And I should select currency
    Then I should enter amount
    And I should choose U.S Dollar
    Then I should press Calculate Costs
    And  I should click on the Purchase button
    Then I should receive confirmation message