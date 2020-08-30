Feature: Test absence of some items in Automation Practice Website

Background: Website is lanunched
Given application is launched
Then homepage is displayed
When user goes to Dresses menu
And user clicks on it
Then Dresses page is displayed

@NotPresent
Scenario Outline: Verify items not present
Then user verifies "<Item>" is not present

Examples:
|Item|
|Printed Dress Black $36.00|
|Printed Dress White $40.00|