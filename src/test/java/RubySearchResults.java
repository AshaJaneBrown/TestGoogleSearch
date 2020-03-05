import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class RubySearchResults extends GoogleSearchPage {

    By searchItem = By.xpath("//h3[@class='LC20lb DKV0Md']");
    List<WebElement> searchItems;

    public void findResults(){
        searchItems = driver.findElements(searchItem);
    }

    @Test
    public void checkResults() {
        enterSearchRequest("Ruby");
        Assert.assertTrue(atPage("Ruby - Пошук Google"));
        findResults();

        for (int i = 0; i < searchItems.size(); i++) {
            String item = searchItems.get(i).getText();
            Assert.assertTrue(item.contains("Ruby"));
        }

    }
}



