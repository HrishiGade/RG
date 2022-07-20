Feature: Login to Invue Admin Application

Scenario: Login with valid Credentials

Given User is on Login Page
When User enters valid username "qa@gmail.com" and password "12345"
Then Login should work and User should land on Dashboard




