Feature: Test below list of scenarios

Background: Website is lanunched
Given application is launched
Then homepage is displayed
When user goes to Dresses menu
And user clicks on it
Then Dresses page is displayed

@Present
Scenario Outline: Verify items present
Then user verifies "<Item>" is present

Examples:
|Item|
|Printed Dress $26.00|
|Printed Dress $50.99|
|Printed Summer Dress $28.98|
|Printed Summer Dress $30.50|
|Printed Chiffon Dress $16.40|