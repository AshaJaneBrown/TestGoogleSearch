import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.GoogleSearchPage;

public class BaseTest {

    WebDriver driver;
    GoogleSearchPage googleSearch;
    public static String address = "http://google.com.ua/";

    public void openGoogleSearch()
    {
        driver = createDriver();
        googleSearch = new GoogleSearchPage(driver);
        driver.get(address);
    }

    public void closeBrowser() {

        driver.quit();
    }

    public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src/main/resources/chromedriver.exe");
        return new ChromeDriver();
    }

    @BeforeClass
    public void start(){
        openGoogleSearch();
    }

    @AfterClass
    public void finish(){
        closeBrowser();
    }
}
