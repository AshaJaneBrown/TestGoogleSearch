import org.testng.Assert;
import org.testng.annotations.*;

public class JavaSearch {

    @Test
    public void validatePage() {
        Browser browser = new Browser();
        browser.runSearch();
        browser.getSearchField().sendKeys("Java");
        browser.getSearchField().submit();
        String pageTitle = "Java - Пошук Google";
        Assert.assertEquals(pageTitle, browser.getDriver().getTitle());
        browser.closeBrowser();
    }
}


