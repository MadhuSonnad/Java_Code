Feature: Login

Scenario: Successful Login with valid credentials

  Given User launch Chrome browser 
  When  User opens URL "http://admin-demo.nopcommerce.com/login"
  And user enters Email as "admin@yourstore.com" and Password as "admin"
  And Click on Login 
  Then Page title should be "Dashboard / nopCommerce administration"
  When User click on Log out link
  Then Page title should be "Your store. Login"
  And close browser 
  
  Scenario Outline: Login Data Driven

  Given User launch Chrome browser 
  When  User opens URL "http://admin-demo.nopcommerce.com/login"
  And user enters Email as "<email>" and Password as "<password>"
  And Click on Login 
  Then Page title should be "Dashboard / nopCommerce administration"
  When User click on Log out link
  Then Page title should be "Your store. Login"
  And close browser 
  
  Examples:
  | email | password |
  | admin@yourstore.com  |  admin |
  | admin1@yourstore.com | admin123  | 
  