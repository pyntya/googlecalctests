package Tests;


import PageObjects.Calculator;
import PageObjects.GoogleHomePage;
import PageObjects.GoogleSearchPage;
import net.thucydides.core.annotations.Pending;
import org.jbehave.core.annotations.*;
import org.junit.Assert;


public class CalcSteps {

    Calculator calculator;
    GoogleSearchPage googleSearchPage;


    @Given("I have opened the google calculator")
    @Pending
    public void givenIHaveOpenedTheGoogleCalculator() {
        googleSearchPage.open();
        googleSearchPage.searchFor("calc");
    }

    @When("I have entered 2 plus 2")
    @Pending
    public void whenIHaveEntered2Plus2() {
        calculator.clickTwoButton();
        calculator.clickPlusButton();
        calculator.clickTwoButton();

    }

    @When("Click answer button")
    @Pending
    public void whenClickAnswerButton() {
        calculator.clickAnswerButton();
    }

    @Then("the result should be 4")
    @Pending
    public void thenTheResultShouldBe4() {
        Assert.assertEquals("4", calculator.getAnser());
    }

    @When("I have entered 0 plus 0")
    @Pending
    public void whenIHaveEntered0Plus0() {
        calculator.clickZeroButton();
        calculator.clickPlusButton();
        calculator.clickZeroButton();
    }

    @Then("the result should be 0")
    @Pending
    public void thenTheResultShouldBe0() {
        Assert.assertEquals("0", calculator.getAnser());
    }

}

