Feature: Title of your feature
  I want to use this template for my feature file

  @betaone
  Scenario Outline: Purchase and Dispatch an item
    Given I am in Beta project
    And user open flipkart
    When user enter flipkart login credentials "<user>" and "<password>"
    And user search for 5000 rupee shoes
    Then user purchased and made the payment
    And user dispatched given order id

    Examples: 
      | user     | password |
      | BETA_USR | BETA_PWD |
