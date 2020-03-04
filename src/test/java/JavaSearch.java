import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.SQLOutput;
import java.util.List;

public class JavaSearch extends BaseSearch {
    String stringResult;

    @Test
    public void searchJavaTest() {

        getSearchField().sendKeys("Java");
        getSearchField().submit();
        String pageTitle = "Java - Пошук Google";
        Assert.assertEquals(pageTitle, getDriver().getTitle());
        List<WebElement> searchResults = getDriver().findElements(By.xpath("//h3[@class='LC20lb DKV0Md']"));
        for (int i = 0; i < searchResults.size(); i++) {
            stringResult = searchResults.get(i).getText();
//            System.out.println(stringResult);
            Assert.assertTrue(stringResult.contains("Java") || stringResult.contains("Джава"));
        }
    }
}



