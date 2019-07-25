Feature: Login Page

Scenario Outline: Test Me login for user
When I provide username "<Uname>"
And I provide password "<Pswrd>"
Then I click on login and verify the login status
Examples:
| Uname | Pswrd |
| lgdhbdu8972 | fndifdfkQl7 |