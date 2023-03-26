package pl.coderslab.seleniumcourseonlteaw35;

// test https://duckduckgo.com/ search

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class DuckDuckGoTest {
    @Test
    public void searchWithDuckDuckGo() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // given
        driver.get("https://duckduckgo.com/");
        // when
        WebElement searchInput = driver.findElement(By.id("search_form_input_homepage"));
        searchInput.clear();
        final String searchQuery = "W pustyni i w puszczy";
        searchInput.sendKeys(searchQuery);
        WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
        searchButton.click();
        // then
        List<WebElement> elements = driver.findElements(By.cssSelector("div#links article h2"));
        for(int i=0; i<3; i++) {
            WebElement searchResult = elements.get(i);
            final String searchResultText = searchResult.getText();
            if (!searchResultText.contains(searchQuery)) {
                fail("Search result must contain: " + searchQuery + ", but was: " + searchResultText);
            }
        }
//        driver.close();
    }

    @Test
    public void searchWithDuckDuckGoEnter() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        WebElement searchInput = driver.findElement(By.id("search_form_input_homepage"));
        searchInput.clear();
        searchInput.sendKeys("W pustyni i w puszczy" + Keys.ENTER);
    }
}
