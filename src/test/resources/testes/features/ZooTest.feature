Feature: To test the high level functionality of the Zoo test site

  Background: 
    Given I am on the zoo websites

  Scenario: To set the start data
    When I click onn "adoption"
    Then I set the start date to "Today"
    Then I quit the browser

  Scenario: To populate the contact form
    When I click onn "contact"
    Then I populate the contact form
    Then I quit the browser

  Scenario: To populate the contact form
    When I click onn "about"
    Then I quit the browser

  Scenario: To populate the contact form
    When I click onn "home"
    Then I quit the browser
