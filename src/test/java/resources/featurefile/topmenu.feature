Feature: Desktop Menu
  As a user I am going to nevigate all required page


  @sanity @regression
  Scenario: User should navigate to page successfully after clicked on menu
    Given I am on homepage
    When  I mouse hover “Desktops” Tab and click
    And   I click on “Show All Desktops” submenu
    And   I Mouse hover on “Laptops & Notebooks”
    And   I click on “Show All Laptops & Notebooks” submenu
    And   I click on “Components” submenu
    And   I click on “Show All Components” submenu
    Then  I able to see on respective page


  @smoke @regression
  Scenario: User can see product with sort By requirement
    Given I am on homepage
    When  I mouse hover “Desktops” Tab and click
    And   I click on “Show All Desktops” submenu
    And   I sorting product with selecting position "Name: Z to A"
    Then  I can see all the product sort it out as per the requirement
