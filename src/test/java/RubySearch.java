import org.testng.Assert;
import org.testng.annotations.*;

public class RubySearch {

    @Test
    public void validatePage() {
        Browser browser = new Browser();
        browser.runSearch();
        browser.getSearchField().sendKeys("Ruby");
        browser.getSearchField().submit();
        String pageTitle = "Ruby - Пошук Google";
        Assert.assertEquals(pageTitle, browser.getDriver().getTitle());
        browser.closeBrowser();
    }
}


