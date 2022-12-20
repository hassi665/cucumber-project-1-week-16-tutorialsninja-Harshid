Feature: Laptops & Notebooks Menu
  As a user I am going to nevigate all required page

  @sanity @smoke
  Scenario: User can see product with sort By requirement
    Given I am on homepage
    When  I mouse hover “Laptops & Notebooks” Tab and click
    And   I click on “Show All Laptops & Notebooks”
    And   I sortout product with selecting position "Price (High > Low)"
    Then  I can see all the product sort it out as per the requirement
