Feature: Search product tests
  As a customer, I want to view search suggestions

  Background: Home page of bhinneka.com

  @ScenarioOutline
  Scenario Outline: View search suggestion link without authorizations
    Given Home page without authorizations
    When Input data with "<Brand>" in search bar
    Then Search product link with "<Brand>" data is displayed
    Examples:
      | Brand   |
      | samsung |
      | apple   |

  @SharingDataValidation
  Scenario: Search product with product list result validation
    Given Home page without authorizations
    When Search product with "Macbook" keyword
    Then Product list is displayed