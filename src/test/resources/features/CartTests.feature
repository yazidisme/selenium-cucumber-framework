Feature: Cart tests
  As a Customer, I want to view cart menu and add product to cart

  @PositiveCase @Development @Staging @new
  Scenario: Login after access cart without authorizations
    Given Open the browser with bhinneka home page
    And Home page without authorizations
    When Go to cart page without authorizations
    And Quit the session