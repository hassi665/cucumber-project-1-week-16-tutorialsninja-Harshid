Feature: Register Test
  As user I want to register into tutorialsninja  website

  @smoke12
  Scenario: User should create account successfully
    Given I am on homepage
    When  I click on myaccount link
    And   I Call the method “selectMyAccountOptions” method and pass the parameter “Register”
    And   I fill all the required details for registration
    And   I again click on "My account" link
    And   I Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
    And   I can see successfully logout
    Then  I Click on “continue” button
