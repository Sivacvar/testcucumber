Feature: Validate the login functionality

@smoke
Scenario: Validate Login functionality with valid input
Given I am on login page
When I have entered username and password #set of actions
And I have clicked login btn
Then Validate the successful msg #Validation, assetion

