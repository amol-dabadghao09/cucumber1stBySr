Feature: Registration of Bank Account
Scenario: User information for bank account opening
Given User should be at Registration page
When User enters the following data
|carlos | sonberg | carlos@abc.com | 8877665544 |
|rina | roy | rina@abc.com | 9977665544 |
Then User gets registration confirmation
