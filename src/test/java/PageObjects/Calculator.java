package PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Calculator extends PageObject {

    public Calculator(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div/span[@class=\"cwcot\"]")
    WebElement mainField;

    @FindBy(xpath = " //div//span[text()=\"0\"]")
    WebElement zeroButton;

    @FindBy(xpath = " //div//span[text()=\"1\"]")
    WebElement oneButton;

    @FindBy(xpath = " //div//span[text()=\"2\"]")
    WebElement twoButton;

    @FindBy(xpath = " //div//span[text()=\"3\"]")
    WebElement threeButton;

    @FindBy(xpath = " //div//span[text()=\"4\"]")
    WebElement fourButton;

    @FindBy(xpath = " //div//span[text()=\"5\"]")
    WebElement fiveButton;

    @FindBy(xpath = " //div//span[text()=\"6\"]")
    WebElement sixButton;

    @FindBy(xpath = " //div//span[text()=\"7\"]")
    WebElement sevenButton;

    @FindBy(xpath = " //div//span[text()=\"8\"]")
    WebElement eightButton;

    @FindBy(xpath = " //div//span[text()=\"9\"]")
    WebElement nineButton;

    @FindBy(xpath = " //div//span[text()=\"=\"]")
    WebElement answerButton;

    @FindBy(xpath = " //div//span[text()=\"+\"]")
    WebElement plusButton;

    public void typeExpression(String expression) {
        mainField.click();
        mainField.sendKeys(expression);
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

    public void clickAnswerButton() {
        answerButton.click();
    }

    public String getAnswer() {
        return mainField.getText();
    }

}
