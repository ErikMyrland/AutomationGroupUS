Feature: Documentation feature
  Agile story : As a user, I want to access the documentation page.
  AC: 1.Verify the “Odoo Documentation” message is displayed n a new window.
  2.Verify there are 4 main document topics are listed.


  Scenario: Access to documentation page
    When user is on the base page
    Then user login as a POSManager
    And user should see documentation
    Then user clicks at documentation
    And documentation is displayed at the window
    And 4 main documents topics are displayed
