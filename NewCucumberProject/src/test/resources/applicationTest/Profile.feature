Feature: Profile Finctionality
Scenario: Add profile
Given User is at the Home page
When User clicks on the add profile button
And User provides the information
Then Profile gets created 

Scenario: Update profile
Given User is at the Home page
When User clicks on the edit profile link
And User update the information
Then profile gets updated 

Scenario: Delete profile
Given User is at the Home page
When User clicks on the delete profile link
And User confirms delete
Then profile gets deleted
