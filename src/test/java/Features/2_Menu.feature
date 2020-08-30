Feature: Test Dresses Menu of Automation Practice Website

Background: Website is lanunched
Given application is launched
Then homepage is displayed

@Menu
Scenario: Verify Dresses Menu
When user goes to Dresses menu
And user clicks on it
Then Dresses page is displayed