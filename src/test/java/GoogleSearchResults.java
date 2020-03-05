import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.SQLOutput;
import java.util.List;

public class GoogleSearchResults extends GoogleSearchPage {

    By searchItem = By.xpath("//h3[@class='LC20lb DKV0Md']");
    List<WebElement> searchItems;
    String request;

    public void findItems(){
        searchItems = driver.findElements(searchItem);
    }

    @Test
    public void searchAndCheck() {
        request = System.getProperty("searchString");
        enterSearchRequest(request);
        Assert.assertTrue(atPage(request + " - Пошук Google"));
        findItems();
        System.out.println("My request: " + request);

        for (int i = 0; i < searchItems.size(); i++) {
            String item = searchItems.get(i).getText();
            Assert.assertTrue(item.contains(request));
        }
    }
}

//mvn clean test -DsearchString=Java