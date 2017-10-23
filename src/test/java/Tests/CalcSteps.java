package Tests;


import PageObjects.Calculator;
import PageObjects.GoogleSearchPage;
import org.jbehave.core.annotations.*;
import org.junit.Assert;


public class CalcSteps {

    Calculator calculator;
    GoogleSearchPage googleSearchPage;

    @Given("I have opened the google search page")
    public void givenIHaveOpenedTheGoogleSearchPage() {
        googleSearchPage.open();
    }

    @Given("Searched for the calc keyword")
    public void givenSearchedForTheCalcKeyword() {
        googleSearchPage.searchFor("calc");
    }

    @When("click plus button")
    public void whenClickPlusButton() {
        calculator.clickPlusButton();
    }

    @When("click minus button")
    public void whenClickMinusButton() {
        calculator.clickMinusButton();
    }

    @When("click multiplication button")
    public void whenClickMultiplicationButton() {
        calculator.clickMultiplicationButton();
    }

    @When("click division button")
    public void whenClickDivisionButton() {
        calculator.clickDivisionButton();
    }

    @When("click answer button")
    public void whenClickAnswerButton() {
        calculator.clickAnswerButton();
    }

    @When("I click $num button")
    public void whenIClicknumButton(String num) {
        clickNumberButton(num);
    }

    @Then("The result should be $result")
    public void thenTheResultShouldBeresult(String result) {
        Assert.assertEquals(result, calculator.getAnswer());
    }

    public void clickNumberButton(String number) {
        char num[] = number.toCharArray();
        for (char symbol : num) {
            switch (symbol) {
                case '-':
                    calculator.clickMinusButton();
                    break;
                case '0':
                    calculator.clickZeroButton();
                    break;
                case '1':
                    calculator.clickOneButton();
                    break;
                case '2':
                    calculator.clickTwoButton();
                    break;
                case '3':
                    calculator.clickThreeButton();
                    break;
                case '4':
                    calculator.clickFourButton();
                    break;
                case '5':
                    calculator.clickFiveButton();
                    break;
                case '6':
                    calculator.clickSixButton();
                    break;
                case '7':
                    calculator.clickSevenButton();
                    break;
                case '8':
                    calculator.clickEightButton();
                    break;
                case '9':
                    calculator.clickNineButton();
                    break;
                case '(':
                    calculator.clickLeftBracketButton();
                    break;
                case ')':
                    calculator.clickRightBracketButton();
                    break;
            }
        }
    }

}

