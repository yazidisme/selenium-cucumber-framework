Feature: Login tests
  As Customer B2B2B, I can login to Bhinneka.com

  Background: Home page of bhinneka.com
    Given Open the browser with bhinneka home page

  @PositiveCase @Staging @Development @test
  Scenario: Login to Bhinneka.com using valid account that registered in personal and corporate account type
    Given Login form in login page
    And Login page is displayed
    When Input "your@email.com" as email, "Yourp@ssw0rd" as password, "personal and corporate" as account type
    And Quit the session

  @PositiveCase @Staging @Development @testing
  Scenario: Login to Bhinneka.com using valid account that registered in personal account type
    Given Login form in login page
    And Login page is displayed
    When Input "your@email.com" as email, "Yourp@ssw0rd" as password, "personal" as account type
    And Quit the session