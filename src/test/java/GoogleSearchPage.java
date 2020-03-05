import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class GoogleSearchPage {

    WebDriver driver;
    By searchField = By.name("q");

    public void enterSearchRequest(String searchRequest) {
        driver.findElement(searchField).sendKeys(searchRequest);
        driver.findElement(searchField).submit();
    }

       public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src/main/resources/chromedriver.exe");
        return new ChromeDriver();
    }

    public boolean atPage(String pageTitle){
        if (driver.getTitle().equals(pageTitle))
            return true;
        else
            return false;

    }

    @BeforeClass
    public void openSearch()
    {
        driver = createDriver();
        driver.get("http://google.com.ua/");
    }

    @AfterClass
    public void closeBrowser() {

        driver.quit();
    }
}


