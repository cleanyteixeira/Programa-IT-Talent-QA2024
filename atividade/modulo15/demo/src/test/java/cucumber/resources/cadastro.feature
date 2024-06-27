Feature: Cadastro
    Scenario: Cadastro com sucesso
    Given user is on homepage
    And User clicks on the login button
    When User enters an email o email field
    And User enters a passaword on passaword field 
    Then User shold be redirectioned to SignUp page


    Scenario: Cadastro com email já existente 
    Given User is on Homepage
    And User clicks on the login button
    When ser enters an existing email on email field
    And User enters a passaword on passaword field
    Then User shoud get an error message