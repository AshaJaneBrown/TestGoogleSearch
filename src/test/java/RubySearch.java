import org.testng.Assert;
import org.testng.annotations.*;

public class RubySearch extends BaseSearch {

    @Test
    public void searchRubyTest() {

        getSearchField().sendKeys("Ruby");
        getSearchField().submit();
        String pageTitle = "Ruby - Пошук Google";
        Assert.assertEquals(pageTitle, getDriver().getTitle());
    }
}


