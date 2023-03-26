package pl.coderslab.seleniumcourseonlteaw35;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KonZad3Test {

            //Wejdź na stronę: https://www.google.com
//Wejdź na stronę: https://coderslab.pl/pl
//Cofnij się do strony: https://www.google.com
//Wejdź na stronę: https://mystore-testlab.coderslab.pl/index.php
//Cofnij się do strony: https://www.google.com
//Powróć do strony: https://mystore-testlab.coderslab.pl/index.php
//Odśwież stronę: https://mystore-testlab.coderslab.pl/index.php
        @Test
        public void searchWithDuckDuckGo() {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.google.com");
            driver.get("https://coderslab.pl/pl");
            driver.navigate().back();
            driver.get("https://mystore-testlab.coderslab.pl/index.php");
            driver.navigate().back();
            driver.navigate().forward();
            driver.navigate().refresh();

        }
    }
