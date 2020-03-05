package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

    WebDriver driver;
    By searchField = By.name("q");
    public static String address = "http://google.com.ua/";

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchRequest(String searchRequest) {
        driver.findElement(searchField).sendKeys(searchRequest);
        driver.findElement(searchField).submit();
    }

    public boolean atPage(String pageTitle){
        return driver.getTitle().equals(pageTitle);

    }
}


