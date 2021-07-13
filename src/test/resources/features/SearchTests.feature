Feature: Search product tests
  As a customer, I want to view search suggestions

  @PositiveCase @Development @Staging @new
  Scenario Outline: View search suggestion link without authorizations
    Given Open the browser with bhinneka home page
    And Home page without authorizations
    When Input data with "<Brand>" in search bar
    Then Search product link with "<Brand>" data is displayed
    And Quit the session
    Examples:
      | Brand   |
      | samsung |
      | apple   |