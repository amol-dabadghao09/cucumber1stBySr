Feature: Login Functionality
Scenario: Verify title of page
Given User is at the landing page
When User gets the title of page
Then Title of page should contains "Shopping"

Scenario: Verify the cart icon
Given User is at the landing page
Then cart icon should display

Scenario: Login to application
Given User is at the landing page
When User enters the username as "8176867662"
And User enters the password as "123456"
And User confirms signIn