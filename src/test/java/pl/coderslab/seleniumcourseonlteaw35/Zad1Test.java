package pl.coderslab.seleniumcourseonlteaw35;

// test https://duckduckgo.com/ search

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Zad1Test {
    @Test
    public void zad1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        // given
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        // when
        WebElement hotelLocation = driver.findElement(By.id("hotel_location"));
        assertNotNull(hotelLocation);
        hotelLocation.sendKeys("Warsaw");
        WebElement searchNowButton = driver.findElement(By.id("search_room_submit"));
        assertNotNull(searchNowButton);
        WebElement newsletterInput = driver.findElement(By.id("newsletter-input"));
        assertNotNull(newsletterInput);
        newsletterInput.sendKeys("test@test.com");

//        driver.close();
    }
}
