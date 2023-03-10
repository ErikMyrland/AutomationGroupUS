Feature:As a POS and event CRM manager, I should be able to Login with valid credentials
  AC:Feature: User valid login

  Scenario Outline: Verify user information <email>
    When user is on the base page
    When I login using "<email>" "<password>"
    Then account holder name should be "<name>"
    Examples:
      |           email     |  password|  name      |
      |posmanager55@info.com|posmanager|POSManager55|
      |posmanager67@info.com|posmanager|POSManager67|
      |posmanager89@info.com|posmanager|POSManager89|


    ##posmanager55
  ##posmanager67
  ##posmanager89
