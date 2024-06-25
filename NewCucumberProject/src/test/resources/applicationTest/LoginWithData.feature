Feature: Login with specific data
Scenario: Login with Valid credential
Given User is at login page
When users enters userName As "amd_user"
And users enters Password As "your_password"
And user click on Login Button
Then user should get logined in to app