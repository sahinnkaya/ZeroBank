Feature: ZeroBankNegativeLogin

  Background:
    Given Navigate to ZeroBank website
    When  I click on SignIn

  Scenario Outline: ZeroBank Negative Login Test
    When  I enter "<username>" in the login box
    When  I enter "<password>" in password box
    When  I click on Sign In button
    And   I should see the wrong login title "<title>"
#    And   I should see the wrong login message "<message>"

    Examples:
    | username | password | title                       | message                          |
    | username | pass     | Troubles entering the site? | Login and/or password are wrong. |
#    | user     | password | Troubles entering the site? | Login and/or password are wrong. |
#    | user     | pass     | Troubles entering the site? | Login and/or password are wrong. |
#    | username |          | Troubles entering the site? | Login and/or password are wrong. |
#    |          | password | Troubles entering the site? | Login and/or password are wrong. |
#    |          |          | Troubles entering the site? | Login and/or password are wrong. |