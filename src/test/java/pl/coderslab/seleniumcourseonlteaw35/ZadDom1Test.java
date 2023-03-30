package pl.coderslab.seleniumcourseonlteaw35;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ZadDom1Test {

    //Na stronie https://mystore-testlab.coderslab.pl/index.php wykonaj następującą sekwencję kroków:
    //
    //Wejdź na stronę główną.
    //Przejdź do opcji 'Sign in'
    //Wybierz opcję 'No account? Create one here'
    //Za pomocą metod nawigacyjnych przejdź do strony głównej.

    @Test
    public void searchButton() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        WebElement buttonSignIn = driver.findElement(By.className("hidden-sm-down"));
        buttonSignIn.click();

//        WebElement searchNowButton = driver.findElement(By.id("search_room_submit"));
//        assertNotNull(searchNowButton);
 //       searchButton.click();
 //       WebElement newsletterInput = driver.findElement(By.id("newsletter-input"));
 //       newsletterInput.clear();
 //       newsletterInput.sendKeys("test@test.com");


    }
}