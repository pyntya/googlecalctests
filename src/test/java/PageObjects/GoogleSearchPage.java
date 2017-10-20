package PageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.google.com")
public class GoogleSearchPage extends PageObject {

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="lst-ib")
    WebElement search;

    public void searchFor(String text){
        search.sendKeys(text, Keys.ENTER);
    }
}
