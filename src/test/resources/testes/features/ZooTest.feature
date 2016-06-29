Feature: To test the high level functionality of the Zoo test site

  Background: 
    Given I stay on the zoo websites

  Scenario: To populate the contact form
    When I click the "contact"
    And I enter "Name test" into the name field
    And I enter "Address test" into the address field
    And I enter "Postcode test" into the postcode field
    And I enter "Email test" into the email field
    And I submit the contact form
    Then I checked I am on the confirmation page
    And I closed the browser
