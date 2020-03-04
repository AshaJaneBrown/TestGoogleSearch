import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseSearch {

    WebDriver driver;
    By searchField = By.name("q");

    public void openBrowser() {
        driver = createDriver();
        driver.get("http://google.com.ua/");

    }
    public void typeWord(String word) {
        driver.findElement(searchField).sendKeys(word);
        driver.findElement(searchField).submit();
    }

    public void closeBrowser(){
        driver.quit();
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
    public void start() {
        openBrowser();
    }

    @AfterClass
    public void end() {
        closeBrowser();
    }
}
