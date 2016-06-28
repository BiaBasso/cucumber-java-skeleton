Feature: To test the high level functionality of the Zoo test site

  Background: 
    Given I am on the zoo websites

  Scenario: To set the start data
    When I click onn "adoption"
    Then I set the start date to "Today"
    Then I quit the browser
