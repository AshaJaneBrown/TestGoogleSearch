import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.SQLOutput;
import java.util.List;

public class JavaSearch extends BaseSearch {

    By element = By.xpath("//h3[@class='LC20lb DKV0Md']");
    List<WebElement> results;

    public List<WebElement> findResults(){
        return driver.findElements(element);
    }

    @Test
    public void checkResults() {
        typeWord("Java");
        Assert.assertTrue(atPage("Java - Пошук Google"));
        results = findResults();

        for (int i = 0; i < results.size(); i++) {
            String stringResult = results.get(i).getText();
            Assert.assertTrue(stringResult.contains("Java") || stringResult.contains("Джава"));
        }

    }
}



