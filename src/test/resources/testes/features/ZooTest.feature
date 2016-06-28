Feature: To test the high level functionality of the Zoo test site

  @combo
  Scenario: To set the start data
    Given I am on the zoo websites
    When I click onn "adoption"
    Then I set the start date to "Today"
    Then I quit the browser

  @check
  Scenario: To populate the contact form
    Given I am on the zoo websites
    When I click onn "contact"
    Then I populate the contact form
    Then I quit the browser
