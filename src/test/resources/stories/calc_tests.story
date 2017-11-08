Narrative:
As a user
I want to be told the results of mathematical operations
So that I can avoid silly mistakes

Scenario: Operation with two numbers
Given I'm on google search page with opened calculator
When I click <num1> <operator> <num2>
And click answer button
Then The result should be <result>

Examples:
|num1|operator|num2|result|
|2|-|2|0|
|2|-|1|1|
|1|-|0|1|
|0|-|1|-1|
|-1|-|(-1)|0|
|-1|-|0|-1|
|0|-|(-1)|1|

Scenario: Add two numbers
Given I'm on google search page with opened calculator
When I click <num1> button
And click plus button
And I click <num2> button
And click answer button
Then The result should be <result>

Examples:
|num1|num2|result|
|2|2|4|
|-1|1|0|
|0|1|1|
|1|0|1|
|0.1|0.1|0.2|