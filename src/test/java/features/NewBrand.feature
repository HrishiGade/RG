Feature: Invue Brands

Scenario: Add new Brand

Given User is on Login Page
When User enters valid username "qa@gmail.com" and password "12345"
Then Login should work and User should land on Dashboard

Then User navigates to Add New Brand screen
And User enters Brand Name and clicks on Save 
Then New Brand should get added and reflect on Brands List