Feature: Adding new payees for future transactions

  Background: :
    Given I navigate to the Zero bank page
    When I click on Signin link
    And I enter valid login and user name
      |username|
      |password|
    And I click on the Sing in button

    Scenario: Adding New Payee
      And I click on the online Banking Buttons
      And I click the pay bills button
      And I click the addin new payee button
      And I Send the keys text box

        | hamza                     |
        | Istanbul-Turkey           |
        | 1233524234                |
        | payee details             |

      And I click on the add button
      Then I Should see the The new payee "AddingPayee" was successfully created message








