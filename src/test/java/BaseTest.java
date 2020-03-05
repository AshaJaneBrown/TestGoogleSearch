import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.GoogleSearchPage;

public class BaseTest {

    WebDriver driver;
    GoogleSearchPage googleSearch;

    public void openGoogleSearch()
    {
        driver = createDriver();
        googleSearch = new GoogleSearchPage(driver);
        driver.get(GoogleSearchPage.address);
    }

    public void closeBrowser() {

        driver.quit();
    }

    public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src/main/resources/chromedriver.exe");
        return new ChromeDriver();
    }
}
