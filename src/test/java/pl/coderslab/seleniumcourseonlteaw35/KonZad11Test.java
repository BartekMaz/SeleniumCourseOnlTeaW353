package pl.coderslab.seleniumcourseonlteaw35;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// tes https://duckduckgo.com/ search

public class KonZad11Test {
    @Test
    public void searchWithQwant() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qwant.com/");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.clear();
        searchInput.sendKeys("Hokej na lodzie");
        searchInput.submit();
//        WebElement searchButton = driver.findElement(By.class("_2idgX _35zId _2VIUB _3A7p7"));
//        searchButton.click();

//        driver.close();
    }
}
    