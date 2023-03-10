Feature: As a user, I want to access to the calendar page.
  AC:Verify users get time list by default from 0:00 — to 23:00 , and increase by one our each time.

Scenario: Verify users get time list by default from 0:00 — to 23:00 , and increase by one our each time.
  When user is on the base page
  Then user login with his credentials
  Then user clicks to calendar page
  And user should see list midnight to 23pm
