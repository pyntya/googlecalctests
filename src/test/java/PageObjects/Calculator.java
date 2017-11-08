package PageObjects;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class Calculator extends PageObject {

    @FindBy(css = "#cwos")
    WebElementFacade answerField;

    @FindBy(css = "#cwbt43 > div > span")
    WebElementFacade zeroButton;

    @FindBy(css = "#cwbt33 > div > span")
    WebElementFacade oneButton;

    @FindBy(css = "#cwbt34 > div > span")
    WebElementFacade twoButton;

    @FindBy(css = "#cwbt35 > div > span")
    WebElementFacade threeButton;

    @FindBy(css = "#cwbt23 > div > span")
    WebElementFacade fourButton;

    @FindBy(css = "#cwbt24 > div > span")
    WebElementFacade fiveButton;

    @FindBy(css = "#cwbt25 > div > span")
    WebElementFacade sixButton;

    @FindBy(css = "#cwbt13 > div > span")
    WebElementFacade sevenButton;

    @FindBy(css = "#cwbt14 > div > span")
    WebElementFacade eightButton;

    @FindBy(css = "#cwbt15 > div > span")
    WebElementFacade nineButton;

    @FindBy(css = "#cwbt45 > div > span")
    WebElementFacade answerButton;

    @FindBy(css = "#cwbt46 > div > span")
    WebElementFacade plusButton;

    @FindBy(css = "#cwbt36 > div > span")
    WebElementFacade minusButton;

    @FindBy(css = "#cwbt26 > div > span")
    WebElementFacade multiplicationButton;

    @FindBy(css = "#cwbt16 > div > span")
    WebElementFacade divisionButton;

    @FindBy(css = "#cwbt03 > div > span")
    WebElementFacade leftBracketButton;

    @FindBy(css = "#cwbt04 > div > span")
    WebElementFacade rightBracketButton;

    @FindBy(id = "#cwmcwd")
    WebElementFacade calc;

    @FindBy(css = "#cwclrbtnAC")
    WebElementFacade acButton;

    @FindBy(css = "#cwbt44 > div > span")
    WebElementFacade dotButton;

    public void clickZeroButton() {
        zeroButton.click();
    }

    public void clickOneButton() {
        oneButton.click();
    }

    public void clickTwoButton() {
        twoButton.click();
    }

    public void clickThreeButton() {
        threeButton.click();
    }

    public void clickFourButton() {
        fourButton.click();
    }

    public void clickFiveButton() {
        fiveButton.click();
    }

    public void clickSixButton() {
        sixButton.click();
    }

    public void clickSevenButton() {
        sevenButton.click();
    }

    public void clickEightButton() {
        eightButton.click();
    }

    public void clickNineButton() {
        nineButton.click();
    }

    public void clickPlusButton() {
        plusButton.click();
    }

    public void clickMinusButton() {
        minusButton.click();
    }

    public void clickMultiplicationButton() {
        multiplicationButton.click();
    }

    public void clickDivisionButton() {
        divisionButton.click();
    }

    public void clickLeftBracketButton() {
        leftBracketButton.click();
    }

    public void clickRightBracketButton() {
        rightBracketButton.click();
    }

    public void clickAnswerButton() {
        answerButton.click();
    }

    public void clickDotButton() {
        dotButton.click();
    }

    public void cleanAnswerField() {
        clickAnswerButton();
        acButton.click();
    }

    public String getAnswer() {
        return answerField.getText();
    }

    public void typeExpression(String expression) {
        answerField.click();
        answerField.sendKeys(expression);
    }

    public void clickNumberButton(String number) {
        char num[] = number.toCharArray();
        for (char symbol : num) {
            switch (symbol) {
                case '-':
                    clickMinusButton();
                    break;
                case '.':
                    clickDotButton();
                    break;
                case '0':
                    clickZeroButton();
                    break;
                case '1':
                    clickOneButton();
                    break;
                case '2':
                    clickTwoButton();
                    break;
                case '3':
                    clickThreeButton();
                    break;
                case '4':
                    clickFourButton();
                    break;
                case '5':
                    clickFiveButton();
                    break;
                case '6':
                    clickSixButton();
                    break;
                case '7':
                    clickSevenButton();
                    break;
                case '8':
                    clickEightButton();
                    break;
                case '9':
                    clickNineButton();
                    break;
                case '(':
                    clickLeftBracketButton();
                    break;
                case ')':
                    clickRightBracketButton();
                    break;
            }
        }
    }
}
