Feature:
  Agile story: As a manager, I should be able to get correct information on the Sales page.
  AC:  As a manager, I should be able to get correct information on the Sales page.


  Scenario: Verify manager can get correct information on the sales page
    When user is on the base page
    Then user login as a POSManager
    Then use should see 6 columns