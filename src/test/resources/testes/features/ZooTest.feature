Feature: To test the high level functionality of the Zoo test site

  Background: 
    Given I stay on the zoo websites

  Scenario: To populate the contact form
    When I click the "contact"
    And I populate the entire form
    And I submit the contact form
    Then I checked I am on the confirmation page
    And I closed the browser
