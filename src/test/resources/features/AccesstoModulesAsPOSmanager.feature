Feature: As a POS manager, I should be able to access to the main modules.
  AC: Verify the POS managers access to 22 modules.

  Scenario: Verify POS manager can access to 22 modules

    When user is on the base page
    Then user login as a POSManager
    Then use should see 22 modules