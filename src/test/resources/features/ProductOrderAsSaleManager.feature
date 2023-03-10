Feature: Modules feature
  Agile story: As a Point of Sale manager (POS), I should be able to view product order.
  AC: 1.Verify the POS managers can view the order list on the Point of Sale page, after checking the Order reference, all the orders should be checked.
  2.Verify the Action drop down has 3 options : Import, Export, Delete

  Scenario: Verify checking the orders from point of sale
    When user is on the base page
    Then user login as a sales manager
    And user clicks on point of sale
    Then user clicks at orders
    And user clicks on check boxes and all should be selected








