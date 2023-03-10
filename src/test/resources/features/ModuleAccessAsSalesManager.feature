Feature: Modules feature
  Agile story:  As a sales manager, I should be able to access to the different modules.
  AC: Verify the sales managers access to 19 modules.


  Scenario: Verify access to 19 modules
    When user is on the base page
    Then user login as a sales manager
    Then use should see 19 modules