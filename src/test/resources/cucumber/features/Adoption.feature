Feature: Adopt an animal

  @web
  Scenario: Adopt an animal which is available
    Given I am on the zoo sites
    When I navigate to adoption
    And I check for an available animal
    And I populate the form
    Then There should be a confirmation message
