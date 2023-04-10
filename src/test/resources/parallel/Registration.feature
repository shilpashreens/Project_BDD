Feature: User registration

Scenario: user registration with diffrent data

Given  user on registration page
When  user enters following data
	| shilpa | shree | shilpa@gmail.com | 99999 | bangalore |
	| abc | xyz | abc@gmail.com | 8888888 | mysore |
	| pqr | efg | pqr@gmail.com | 7777777 | tumkur |
Then Registration is done successfull

Scenario: user registration with diffrent data with coloumn

Given user on registration page
When user enter following user deatils with coloumn
	| Firstname | Lastname | Email | pincode | Location |
	| shilpa | shree | shilpa@gmail.com | 99999 | bangalore |
	| abc | xyz | abc@gmail.com | 8888888 | mysore |
	| pqr | efg | pqr@gmail.com | 7777777 | tumkur |
Then Registration is done successfull


