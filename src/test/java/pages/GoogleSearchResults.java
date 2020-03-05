package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class GoogleSearchResults extends GoogleSearchPage {

    By foundItem = By.xpath("//h3[@class='LC20lb DKV0Md']");
    public List<WebElement> foundItems;

    public GoogleSearchResults(WebDriver driver) {
        super(driver);
    }

    public void identifyItems(){
        foundItems = driver.findElements(foundItem);
    }
}
