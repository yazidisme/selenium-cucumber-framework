Feature: Logout tests
  As Customer, I want to Logout

  @PositiveCase @Development @Staging
  Scenario Outline: Logout from home Bhinneka
    Given Open the browser with bhinneka home page
    When Input "<email>" as email, "Yourp@ssw0rd" as password, "<accountType>" as account type
    Then Home page without authorizations
    And Quit the session
    Examples:
      | email              | accountType |
      | single@email.com   | single      |
      | personal@email.com | personal    |