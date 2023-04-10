Feature: login page feature

Background:
Given  user is in loginpage

Scenario: login page title

When user gets title of page
Then page title should be "Superfast Business Loan Up to Rs 20 Lacs! | NeoCash Insta" 

Scenario: verify OTP page

When user enters  mobile number "9876677667"
And click on check box
And click on Apply now button
Then check Verify button is dispalyed
