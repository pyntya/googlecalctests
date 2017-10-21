Meta:

Narrative:
As a user
I want to be told the results of mathematical operations
So that I can avoid silly mistakes

Scenario: Add two numbers
Given I have opened the google search page
And Searched for the calc keyword
When I click <num1> button
And I click plus button
And I click <num2> button
And I click answer button
Then The result should be <result>

Examples:
|num1|num2|result|
|2|2|4|
|1|1|2|
|0|1|1|
|1|0|1|