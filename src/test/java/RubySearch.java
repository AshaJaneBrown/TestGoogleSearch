import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class RubySearch {
    private WebDriver driver;

    @BeforeClass
    public void initialize() {
        driver = getDriver();
    }

    @Test
    public void validatePage(){
        driver.get("http://google.com.ua/");
        WebElement inputField = driver.findElement(By.name("q"));
        inputField.sendKeys("Ruby");
        inputField.submit();
        String pageTitle = "Ruby - Пошук Google";
        Assert.assertEquals(pageTitle, driver.getTitle());
    }
    @AfterClass
    public void closeDriver(){
        driver.quit();
    }

    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src/main/resources/chromedriver.exe");
        return new ChromeDriver();
    }
}

