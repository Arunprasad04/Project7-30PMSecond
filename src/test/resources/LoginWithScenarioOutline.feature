@Smoke @LoginPage @US45878
Feature: Validation of facebook details
@Regression @userName
Scenario Outline: Validate the login page with valid credentials
Given user is on facebook page
When user enters username "<userName>" and password "<passWord>"
And user click the login button
Then Success message is displayed
Examples:
|userName|passWord|
|Test1@gmail.com|457845454|
|Test2@gmail.com|545421221|