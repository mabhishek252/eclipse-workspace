Feature: Login CRM feature
Scenario: CRM Login Test Scenario
	Given User already on login page
	When When login section display
	Then User enter "AbhishekMishra" and "abhi@123"
	Then Click on login button
	Then User on Dashboard page
	Then Click on logout button