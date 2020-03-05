import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleSearchResults;

public class TestGoogleSearch extends BaseTest{
    String request;

    @Test
    public void testSearch() {
        request = System.getProperty("searchString");
        googleSearch.enterSearchRequest(request);
        Assert.assertTrue(googleSearch.atPage(request + " - Пошук Google"));
    }

    @Test (dependsOnMethods = { "testSearch" })
    public void testResults(){
        GoogleSearchResults result = new GoogleSearchResults(driver);
        result.identifyItems();

        System.out.println("My request: " + request + " . My result: " + result.foundItems.size() + " items.");

        for (int i = 0; i < result.foundItems.size(); i++) {
            String item = result.foundItems.get(i).getText();
            Assert.assertTrue(item.contains(request));
        }
    }
}
