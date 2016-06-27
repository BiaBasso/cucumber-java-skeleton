Feature: Submit a valid contact form

  Scenario: Submit form using valid data
    Given I am on the zoo site
    When I navigate to contact
    And I submit the form with valid data
    Then I check that the form has been submitted
