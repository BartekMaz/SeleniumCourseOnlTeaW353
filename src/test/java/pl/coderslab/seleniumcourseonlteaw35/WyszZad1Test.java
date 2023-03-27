package pl.coderslab.seleniumcourseonlteaw35;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WyszZad1Test {

    //Na stronie https://hotel-testlab.coderslab.pl/en/ zidentyfikuj następująca pola/przyciski
    // za pomocą lokalizatora By.id:
    //
    //(pole tekstowe) Hotel Location
    //(przycisk) Search Now
    //(pole tekstowe) Enter your e-mail (pole na dole stron)
    //Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:
    //
    //Hotel Location - Warsaw
    //Enter your e-mail - test@test.com
    //Użyj metody sendKeys np.
    @Test
    public void searchButton() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement searchInput = driver.findElement(By.id("hotel_location"));
        searchInput.clear();
        searchInput.sendKeys("Warsaw");
        WebElement searchButton = driver.findElement(By.id("search_room_submit"));
 //       searchButton.click();
        WebElement newsletterInput = driver.findElement(By.id("newsletter-input"));
        newsletterInput.clear();
        newsletterInput.sendKeys("test@test.com");


    }
}