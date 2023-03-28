package pl.coderslab.seleniumcourseonlteaw35;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WyszZad2Test {

    //Na stronie https://hotel-testlab.coderslab.pl/en/ zidentyfikuj następująca pola/przyciski
    // za pomocą lokalizatora By.name:
    //
    //(pole tekstowe) Hotel Location
    //(przycisk) Search Now
    //(pole tekstowe) Enter your e-mail (pole na dole stron)
    //(przycisk) Subscribe
    //Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:
    //
    //Hotel Location - Warsaw
    //Enter your e-mail - test@test.com
    //Dodatkowo kliknij przycisk Serach Now, używając metody Submit

    @Test
    public void zad2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement searchInput = driver.findElement(By.name("hotel_location"));
        searchInput.clear();
        searchInput.sendKeys("Warsaw");

        WebElement newsletterInput = driver.findElement(By.name("email"));
        newsletterInput.clear();
        newsletterInput.sendKeys("test@test.com");

        WebElement searchSubscribe = driver.findElement(By.name("submitNewsletter"));
        assertNotNull(searchSubscribe);

//      WebElement searchButtonNow = driver.findElement(By.name("search_room_submit"));
//      searchButtonNow.submit();


    }
}