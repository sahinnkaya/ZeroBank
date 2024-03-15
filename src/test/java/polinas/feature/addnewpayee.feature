Feature: Add New Payee to Zero Bank

  Scenario Outline: Successfully adding a new payee
    Given I am logged into the Zero web application
    And I navigate to the online banking section
    And I click on the "Pay Bills" button
    And I click on the "Add New Payee" button
    When I enter the payee's name "<name>", address "<address>", account number "<accountNumber>", and details "<details>"
    And I click on the add button
    Then I should receive a confirmation message indicating the successful addition of the new payee

    Examples:
      | name  | address | accountNumber | details          |
      | Alex  | Moscow  | 963485        | electricity bill |
