Feature: Search product tests
  As a customer, I want to view search suggestions

  Background: Home page of bhinneka.com
    Given Open the browser with bhinneka home page

  @PositiveCase @Development @Staging @new
  Scenario Outline: View search suggestion link without authorizations
    Given Home page without authorizations
    When Input data with "<Brand>" in search bar
    Then Search product link with "<Brand>" data is displayed
    And Quit the session
    Examples:
      | Brand   |
      | samsung |
      | apple   |