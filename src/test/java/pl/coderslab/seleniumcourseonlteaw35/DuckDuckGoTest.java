package pl.coderslab.seleniumcourseonlteaw35;

// tes https://duckduckgo.com/ search

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuckDuckGoTest {
    @Test
    public void searchWithDuckDuckGo() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
//        driver.close();
    }
}
