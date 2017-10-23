Meta:

Narrative:
As a user
I want to be told the results of mathematical operations
So that I can avoid silly mistakes


Scenario: Add two numbers
Given I have opened the google search page
And Searched for the calc keyword
When I click <num1> button
And click plus button
And I click <num2> button
And click answer button
Then The result should be <result>

Examples:
|num1|num2|result|
|-2|2|0|
|1|1|2|
|0|1|1|
|1|0|1|

Scenario: Substract two numbers
Given I have opened the google search page
And Searched for the calc keyword
When I click <num1> button
And click minus button
And I click <num2> button
And click answer button
Then The result should be <result>

Examples:
|num1|num2|result|
|1|1|0|
|3|1|2|
|0|1|-1|
|0|(-1)|1|

Scenario: Multiplicate two numbers
Given I have opened the google search page
And Searched for the calc keyword
When I click <num1> button
And click multiplication button
And I click <num2> button
And click answer button
Then The result should be <result>

Examples:
|num1|num2|result|
|1|1|1|
|3|1|3|
|0|1|0|
|(-1)|(-1)|1|

Scenario: Divide two numbers
Given I have opened the google search page
And Searched for the calc keyword
When I click <num1> button
And click division button
And I click <num2> button
And click answer button
Then The result should be <result>

Examples:
|num1|num2|result|
|1|1|1|
|3|1|3|
|1|3|0.33333333333|
|0|0|Error|
|1|0|Infinity|