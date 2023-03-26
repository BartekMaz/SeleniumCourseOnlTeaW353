package pl.coderslab.seleniumcourseonlteaw35;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// tes https://duckduckgo.com/ search

    public class KonZad1Test {
        @Test
        public void searchWithDuckDuckGo() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://duckduckgo.com/");
            WebElement searchInput = driver.findElement(By.id("search_form_input_homepage"));
            searchInput.clear();
            searchInput.sendKeys("W pustyni i w puszczy");
            WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
            searchButton.click();

//        driver.close();
        }
    }
    