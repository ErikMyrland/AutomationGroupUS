Feature: As POS & Sales manager, I want to manage quotations on the Sales page.
  AC: Verify users can select all the quotations by clicking the top checkbox.

  Scenario Outline: Verify manage quotations
    When user is on the base page
    When I login using "<email>" "<password>"
    Then user clicks at sales module
    And user can click and select all of the check boxes
    Then account holder name should be "<name>"
    Examples:
      | email                   | password     | name           |
      | posmanager55@info.com   | posmanager   | POSManager55   |
      | salesmanager14@info.com | salesmanager | SalesManager14 |

