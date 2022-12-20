Feature: Login Test
  As user I want to login into tutorialsninja  website

  @smoke
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When  I click on myaccount link
    And   I Call the method “selectMyAccountOptions” method and pass the parameter “Login”
    And   I enter email
    And   I enter password
    Then  I able to click on login button successfully





