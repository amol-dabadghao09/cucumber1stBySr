Feature: Signup
Scenario Outline: Signup to application with different combination
Given User is at Signup page
When User enters "<name>" on form
And User enters "<age>" inside form
And User confirms "<gender>" on the form

Examples:
| name | age | gender |
| john | 18 | Male |
| Carter | 5 | Male |
| Tia | 68 | Female |
