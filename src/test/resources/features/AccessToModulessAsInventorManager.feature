Feature: As an Inventory manager, I should be able to access to the main modules.
  AC: Verify the Inventory managers access to 16 modules.

  Scenario: Verify if Inventory manager can access to 16 modules

    When user is on the base page
    Then user login as a Inventory manager
    Then use should see 16 modules