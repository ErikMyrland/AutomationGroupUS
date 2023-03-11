Feature: Modules feature
  Agile story:  As an Expenses manager, I should be able to access to the different modules.
  AC: Verify the Event managers access to 23 modules.


  Scenario: Verify access to 15 modules
    When user is on the base page
    Then user login as a Expenses manager
    Then use should see 12 modules