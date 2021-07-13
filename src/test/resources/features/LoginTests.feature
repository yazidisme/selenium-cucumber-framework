Feature: Login tests
  As Customer B2B2B, I can login to Bhinneka.com

  Background: Home page of bhinneka.com
    Given Login form in login page

  @PositiveCase @Staging @Development @test
  Scenario: Login to Bhinneka.com using valid account that registered in personal and corporate account type
    When Login page is displayed
    And Input "your@email.com" as email, "Yourp@ssw0rd" as password, "personal and corporate" as account type

  @PositiveCase @Staging @Development @testing
  Scenario: Login to Bhinneka.com using valid account that registered in personal account type
    When Login page is displayed
    And Input "your@email.com" as email, "Yourp@ssw0rd" as password, "personal" as account type