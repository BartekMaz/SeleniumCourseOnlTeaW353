package pl.coderslab.seleniumcourseonlteaw35;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class WyszZad3Test {

        //Na stronie https://hotel-testlab.coderslab.pl//en/
        // zidentyfikuj następująca pola/przyciski za pomocą lokalizatora By.className:
        //
        //(przycisk) Sign In
        //(pole tekstowe) Email address
        //Po zidentyfikowaniu elementów kliknij przycisk Sign In i wpisz dowolny adres e-mail w pole Email address.
        //
        //Rozpocznij tworzenie nowego użytkownika za pomocą kliknięcia przycisku Create an account
        // (nie musi być z wykorzystaniem lokalizatora By.className)
        @Test
        public void zad3() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("https://hotel-testlab.coderslab.pl//en/");

            WebElement searchSignIn = driver.findElement(By.className("hotel_location"));
            searchSignIn.click();

        }
    }

