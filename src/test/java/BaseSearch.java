import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseSearch {

    private WebDriver driver;
    private WebElement searchField;

    public WebDriver getDriver() {
        return driver;
    }

    public WebElement getSearchField() {
        return searchField;
    }


    @BeforeClass
    public void start() {
        runSearch();
    }

    @AfterClass
    public void end() {
        closeBrowser();
    }


    public void runBrowser(){
        driver = createDriver();
        driver.get("http://google.com.ua/");
    }

    public void runSearch() {
        this.runBrowser();
        searchField = driver.findElement(By.name("q"));
    }

    public void closeBrowser(){
        driver.quit();
    }

    public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src/main/resources/chromedriver.exe");
        return new ChromeDriver();
    }

}
