Feature: Order Information
Background:
Given User should be logined In to application
When User clicks on orders link
Then User should redirected to orders page


Scenario: previously placed order information
When user click on the past orders button
Then user should able to see the past order information

Scenario: currently placed order information
When user click on the current orders button
Then user should able to see current placed order information
