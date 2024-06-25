Feature: Login Factionality
Scenario: Login validation with credential
Given User is at login Page
When Users enters username
And Users enters password
And Users clicks on login button
Then User should get redirect to Home Page

Scenario: Page Title Validation
Given User is at login Page
When User get the Title of page
Then Page title should be verified
