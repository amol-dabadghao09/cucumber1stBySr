Feature: Profile Picture Finctionality

@sanity
Scenario: Add profile Picture
Given user is at the Home page
When User clicks on the Avtar
And User selects the image to upload
Then Profile Picture gets uploaded

@regration
Scenario: Update Picture profile
Given user is at the Home page
When User clicks on the edit Avtar
And User update the Picture
Then Picture profile gets updated 

@fuctional
Scenario: Delete profile Picture
Given user is at the Home page
When User clicks on the delete profile Picture link
And User confirms delete Picture
Then profile Picture gets deleted
