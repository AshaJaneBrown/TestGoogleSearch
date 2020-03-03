import org.testng.Assert;
import org.testng.annotations.*;

public class JavaSearch extends BaseSearch {

    @Test
    public void searchJavaTest() {

        getSearchField().sendKeys("Java");
        getSearchField().submit();
        String pageTitle = "Java - Пошук Google";
        Assert.assertEquals(pageTitle, getDriver().getTitle());
    }
}


