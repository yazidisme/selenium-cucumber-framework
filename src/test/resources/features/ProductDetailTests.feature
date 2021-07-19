Feature: Product detail tests
  As a Customer, I want to view product detail menu

  Background: Home page of bhinneka.com
    Given Home page without authorizations

  @HandleAjaxCall
  Scenario: View product detail from product list without authorizations
    Given Search product with "umroh exclusive" keyword
    When Select product in 1 list
    Then Product detail with "non fisik" type is displayed
