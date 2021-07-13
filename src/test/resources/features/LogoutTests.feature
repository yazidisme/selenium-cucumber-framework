Feature: Logout tests
  As Customer, I want to Logout

  Background: Home page of bhinneka.com

  @PositiveCase @Development @Staging
  Scenario Outline: Logout from home Bhinneka
    When Input "<email>" as email, "Yourp@ssw0rd" as password, "<accountType>" as account type
    Then Home page without authorizations
    Examples:
      | email              | accountType |
      | single@email.com   | single      |
      | personal@email.com | personal    |