Feature: feature to test login functionality

  Scenario Outline: Chceck login is successful with valid credentials
    Given user is o login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | user1    | pass1    |
