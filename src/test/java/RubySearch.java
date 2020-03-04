import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class RubySearch extends BaseSearch {

    @Test
    public void searchRubyTest() {

        getSearchField().sendKeys("Ruby");
        getSearchField().submit();
        String pageTitle = "Ruby - Пошук Google";
        Assert.assertEquals(pageTitle, getDriver().getTitle());
        List<WebElement> searchResults = getDriver().findElements(By.xpath("//h3[@class='LC20lb DKV0Md']"));
        for (int i = 0; i < searchResults.size(); i++) {
            stringResult = searchResults.get(i).getText();
//            System.out.println(stringResult);
            Assert.assertTrue(stringResult.contains("Ruby"));
        }
    }
}


