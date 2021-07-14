Feature: Login tests
  As Customer B2B2B, I can login to Bhinneka.com

  Background: Home page of bhinneka.com
    Given Login form in login page

  @PositiveCase @Staging @Development @DataTable
  Scenario: Login to Bhinneka.com using valid account that registered in personal and corporate account type
    Given Login page is displayed
    When Input credentials to login
    | your@email.com | Yourp@ssw0rd | personal and corporate |
    And Click selanjutnya button

  @PositiveCase @Staging @Development
  Scenario: Login to Bhinneka.com using valid account that registered in personal account type
    When Login page is displayed
    And Input "your@email.com" as email, "Yourp@ssw0rd" as password, "personal" as account type