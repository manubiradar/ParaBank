@scenario2 @regression
Feature: login functionality

  @positive
  Scenario Outline: Login with valid credentials
    Given user is on login page
    When user enters valid <Username> and <Password>
    And user clicks on login button
    Then user should be navigated to home page

    Examples: 
      | Username    | Password  |
      | poiuyt      | lkjhgf    |
      | manubiradar | biramanu  |
      | avigavane   | gavaneavi |
      | gajajoshi   | joshigaja |
      