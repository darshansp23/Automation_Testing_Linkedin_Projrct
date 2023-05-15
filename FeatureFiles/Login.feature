Feature: Test Linkdin Application

Scenario: Test Login Scenario

Given Launch Linkedin Application Login Page
When User Entered Valid Username and password
Then Login should be successfully


Scenario: Test MyNetwork Option Scenario
      
When User should be clicked on MyNetwork button
Then MyNetwork button should be clicked successfully


Scenario: Test Jobs Option Scenario

When User should be clicked on job button
Then Job button should be clicked successfully
   
Scenario: Test Messaging Option Scenario
      
When User should be clicked on Messaging button
Then Messaging button should be clicked successfully

Scenario: Test Notification Option Scenario
      
When User should be clicked on Notification button
Then Notification button should be clicked successfully  

Scenario: Test Me Option Scenario

When User should be clicked on Me button
Then Me button should be clicked successfully

Scenario: Test Signout Option Scenario

When  User should be clicked on Signout
Then  Signout should be clicked successfully




