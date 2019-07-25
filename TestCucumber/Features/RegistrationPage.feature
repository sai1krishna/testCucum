Feature: Registration Page

Scenario Outline: Test Me Registration
Given Launching of the Test Me App Application
And I click on SignUp link
Then I Provide UserName "saetms85d23"
And I provide FirstName "sai"
And I provide LastName "sai"
And I provide Password "fndifdfkQl7"
And I provide Confirm Password "fndifdfkQl7"
And I provide Gender
And I provide E-Mail "saihghgh12@gmail.com"
And I provide Mobile Number "9676792205"
And I Provide DOB "20/05/1985"
And I provide Address "saifgrgrghre"
And I provide Security Question
And I Provide Answer "blue"
Then I Click on Register

#Scenario Outline: Login page
Given I provide username "<Uname>"
And I provide password "<Pswrd>"
Then I click on login and verify the login status
Examples:
| Uname | Pswrd |
| lgdhbdu8972 | fndifdfkQl7 |


