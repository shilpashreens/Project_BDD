Feature:  Myprofile page

Scenario: Verify user lands on Myprofile page
Given Login to Gp using mobile number "9678786767"
When user enter OTP "123456"
And  user clicks on continue button
Then user lands on Myprofile page
