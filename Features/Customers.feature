#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Customers
  I want to use this template for my feature file

  @tag1
  Scenario: Add New Customer
  Given User launch Chrome browser 
  When  User opens URL "http://admin-demo.nopcommerce.com/login"
  And user enters Email as "admin@yourstore.com" and Password as "admin"
  And Click on Login 
  Then User can view Dashboard
  When User click on customer Menu
  And click on customer Menu Item
  And click on Add new button 
  Then user can view Add new customer page
  When User enter the customer Info
  And click on Save button 
  Then User can view confirmation message "The new customer has been added succesfully"
  
  
  Scenario: Search Customer By EmailID 
 
  Given User launch Chrome browser 
  When  User opens URL "http://admin-demo.nopcommerce.com/login"
  And user enters Email as "admin@yourstore.com" and Password as "admin"
  And Click on Login 
  When User click on customer Menu
  And click on customer Menu Item
 
  And Enter Customer Email
  Then User can view Dashboard
  When click on search button 
  Then User should found Email in the search table 
  And close browser
 

