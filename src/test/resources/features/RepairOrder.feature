Feature: As a POS  & sales manager, I want to get repair order on the Repairs page
  AC:Verify users can select all the repair orders by clicking the top checkbox.

  Scenario Outline:Verify users can select all the repair orders by clicking the top checkbox
    When user is on the base page
    Then user login with "<email>" "<password>"
    Then user clicks Repair module
    And should see repairs page
    Then user can click and select all of the check boxes
    Examples:
      | email                   | password     |
      | posmanager14@info.com   | posmanager   |
      | salesmanager14@info.com | salesmanager |


