Feature: Search product tests
  As a customer, I want to view search suggestions

  Background: Home page of bhinneka.com

  @PositiveCase @Development @Staging @ScenarioOutline
  Scenario Outline: View search suggestion link without authorizations
    Given Home page without authorizations
    When Input data with "<Brand>" in search bar
    Then Search product link with "<Brand>" data is displayed
    Examples:
      | Brand   |
      | samsung |
      | apple   |