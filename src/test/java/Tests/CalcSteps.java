package Tests;


import PageObjects.Calculator;
import PageObjects.GoogleSearchPage;
import org.jbehave.core.annotations.*;
import org.junit.Assert;
import org.junit.Ignore;


public class CalcSteps {

    GoogleSearchPage googleSearchPage;
    Calculator calculator;

    @BeforeStory
    public void openGoogleSearchPage() {
        googleSearchPage.open();
        googleSearchPage.searchFor("calc");
    }

    @Given("I'm on google search page with opened calculator")
    public void givenImOnGoogleSearchPageWithOpenedCalculator() {
        googleSearchPage.getTitle().contains("calc");
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
    public void whenIClickNumButton(String num) {
        calculator.clickNumberButton(num);
    }

    @When("I click <num1> <operator> <num2>")
    public void whenIClickLeftNumberOperatorRightNumber(String num1, String operator,String num2) {
        calculator.clickNumberButton(num1);
        calculator.clickNumberButton(operator);
        calculator.clickNumberButton(num2);

    }

    @Then("The result should be $result")
    public void thenTheResultShouldBeresult(String result) {
        Assert.assertEquals(result, calculator.getAnswer());
        calculator.cleanAnswerField();
    }


}

