@regression @scenario1
Feature: Registeration of New User

  @positive
  Scenario Outline: Register a New User
    Given I am on the register page
    When I enter the details of user such as <FirstName> <LastName> <Address> <City> <State> <ZipCode> <Phone> <SSN> <Username> <Password> <Confirm>
    And I click on Register button
    Then I verify that registeration is successful

    Examples: 
      | FirstName | LastName | Address | City  | State | ZipCode | Phone     | SSN        | Username    | Password  | Confirm   |
      | abc       | xyz      | qwe     | asd   | zxc   |  789456 | 123456789 |  987654321 | poiuyt      | lkjhgf    | lkjhgf    |
      | manu      | biradar  | vihang  | thane | MHA   |  400606 | 987654321 | 9876543210 | manubiradar | biramanu  | biramanu  |
      | avinash   | gavane   | pride   | pune  | MHA   |  412105 | 963852741 | 9876543211 | avigavane   | gavaneavi | gavaneavi |
      | gajanan   | joshi    | dyp     | pune  | MHA   |  412105 | 741852963 | 9876543212 | gajajoshi   | joshigaja | joshigaja |
