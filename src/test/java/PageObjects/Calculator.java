package PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Calculator extends PageObject {

    public Calculator(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#cwos")
    WebElement answerField;

    @FindBy(css = "#cwbt43 > div > span")
    WebElement zeroButton;

    @FindBy(css = "#cwbt33 > div > span")
    WebElement oneButton;

    @FindBy(css = "#cwbt34 > div > span")
    WebElement twoButton;

    @FindBy(css = "#cwbt35 > div > span")
    WebElement threeButton;

    @FindBy(css = "#cwbt23 > div > span")
    WebElement fourButton;

    @FindBy(css = "#cwbt24 > div > span")
    WebElement fiveButton;

    @FindBy(css = "#cwbt25 > div > span")
    WebElement sixButton;

    @FindBy(css = "#cwbt13 > div > span")
    WebElement sevenButton;

    @FindBy(css = "#cwbt14 > div > span")
    WebElement eightButton;

    @FindBy(css = "#cwbt15 > div > span")
    WebElement nineButton;

    @FindBy(css = "#cwbt45 > div > span")
    WebElement answerButton;

    @FindBy(css = "#cwbt46 > div > span")
    WebElement plusButton;

    @FindBy(css = "#cwbt36 > div > span")
    WebElement minusButton;

    @FindBy(css = "#cwbt26 > div > span")
    WebElement multiplicationButton;

    @FindBy(css = "#cwbt16 > div > span")
    WebElement divisionButton;

    @FindBy(css = "#cwbt03 > div > span")
    WebElement leftBracketButton;

    @FindBy(css = "#cwbt04 > div > span")
    WebElement rightBracketButton;

    public void typeExpression(String expression) {
        answerField.click();
        answerField.sendKeys(expression);
    }

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

    public String getAnswer() {
        return answerField.getText();
    }

}
