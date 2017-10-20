package PageObjects;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

@DefaultUrl("https://www.google.com")
public class GoogleHomePage extends PageObject{

    @FindBy(id="lst-ib")
    WebElement search;

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public void searchFor(String text){
        search.sendKeys(text, Keys.ENTER);
    }

}
