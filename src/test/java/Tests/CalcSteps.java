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

    @When("I click 2 button")
    public void whenIClick2Button() {
        calculator.clickTwoButton();
    }

    @When("I click plus button")
    public void whenIClickPlusButton() {
        calculator.clickPlusButton();
    }

    @When("I click answer button")
    public void whenIClickAnswerButton() {
        calculator.clickAnswerButton();
    }

    @Then("The result should be 4")
    public void thenTheResultShouldBe4() {
        Assert.assertEquals("4", calculator.getAnswer());
    }

    @When("I click <num1> button")
    public void whenIClicknum1Button(@Named("num1") String num1) {
        clickNumberButton(num1);
    }

    @When("I click <num2> button")
    public void whenIClicknum2Button(@Named("num2") String num2) {
        clickNumberButton(num2);
    }

    @Then("The result should be <result>")
    public void thenTheResultShouldBeresult(@Named("result") String result) {
        Assert.assertEquals(result, calculator.getAnswer());
    }

    public void clickNumberButton(String number) {
        char num[] = number.toCharArray();
        switch (num[0]) {
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
        }

    }

}

