Meta:

Narrative:
As a user
I want to be told the results of mathematical operations
So that I can avoid silly mistakes

Scenario: Add two numbers
Given I have opened the google calculator
When I have entered 2 plus 2
And Click answer button
Then the result should be 4

Scenario: Add two numbers
Given I have opened the google calculator
When I have entered 0 plus 0
And Click answer button
Then the result should be 0