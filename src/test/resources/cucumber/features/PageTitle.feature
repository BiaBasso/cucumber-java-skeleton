Feature: Check the page title

  #Scenario: Check page title for Adoption page
  # Given I am on the zoo website
  #When I navigate to "adoption_link"
  #Then I check page title is "Adoption"
  #And I close the browser
  #Scenario: Check page title for About page
  # Given I am on the zoo website
  # When I navigate to "about_link"
  # Then I check page title is "About"
  #And I close the browser
  #Scenario: Check page title for Contact page
  # Given I am on the zoo website
  #When I navigate to "contact_link"
  #Then I check page title is "Contact"
  #And I close the browser
  
  # --Esse cenario em baixo, faz a mesma função dos cenarios de cima, usando o Outline Data Tables
  # --Aonde ele pega o link e o title da tabela para poder acessar os links e checar se os titulos conferem
  Scenario Outline: Check page title for Contact page
    Given I am on the zoo website
    When I click on <Link>
    Then I Check I am on <Title>
    And I close the browser

    Examples: 
      | Link          | Title    |
      | adoption_link | Adoption |
      | about_link    | About    |
      | contact_link  | Contact  |
      | home_link     | Home     |
