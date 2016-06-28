Feature: To test the high level functionality of the Zoo test site

  @combo
  Scenario: To set the start data
    Given I am on the zoo websites
    When I click onn "Adoption"
    Then I set the start date to "Today"
    Then I close the browser

  @check
  Scenario: To populate the contact form
    Given I am on the zoo websites
    When I click onn "Contact"
    Then I populate the contact form
    Then I close the browser
