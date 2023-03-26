package pl.coderslab.seleniumcourseonlteaw35;

// tes https://duckduckgo.com/ search

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DuckDuckGoTest {
    @Test
    public void searchWithDuckDuckGo() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        WebElement searchInput = driver.findElement(By.id("search_form_input_homepage"));
        searchInput.sendKeys("W pustyni i w puszczy");
        WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
        searchButton.click();
//        driver.close();
    }
}
