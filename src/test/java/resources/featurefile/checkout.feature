Feature: Product Checkout
  As user I want to checkout online from tutorialsninja  website

  @sanity @regression
  Scenario: User can add product in shopping cart from Desktop menu
    Given I am on homepage
    When  I mouse hover “Desktops” Tab and click
    And   I click on “Show All Desktops” submenu
    And   I sort by position "Name: A to Z
    And   I select product “HP LP3065”
    And   I select Delivery Date "2022-11-30"
    And   I select Qty 1
    And   I click on Add cart button
    And   I click on link “shopping cart” display into success message
    And   I change the currency to "£" from "$"
    Then  I redirected to shopping cart page

  @smoke @regression
  Scenario: User can add product in shopping cart from Laptops & Notebooks menu
    Given I am on homepage
    When  I mouse hover on “Laptops & Notebooks”
    And   I click on “Show All Laptops & Notebooks"
    And   I change the currency to "£" from "$"
    And   I sort by "Price (High > Low)"
    And   I select product “MacBook”
    And   I click on 'Add To cart' button
    And   I click on “shopping cart” display into success message
    And   I Change Quantity From "1" to "2"
    And   I Click on update
    And   I Click on checkout button
    And   I Click on “Guest Checkout” radio button
    And   I Click on “continue” tab
    And   I filled the required information
    And   I add a comment "Deliver me immediatly"
    And   I Check the Terms & Conditions check box
    And   I Click on “Continue” button after comment
    Then  I will get some error message
