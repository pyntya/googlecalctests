package PageObjects;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class GoogleSearchPage extends PageObject {

    public GoogleSearchPage(WebDriver driver) {
        super(driver);
        driver.manage().window().maximize();
    }

    @FindBy(id = "lst-ib")
    WebElementFacade search;

    public void searchFor(String text) {
        search.sendKeys(text, Keys.ENTER);
    }


}
