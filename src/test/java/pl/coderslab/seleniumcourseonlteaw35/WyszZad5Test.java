package pl.coderslab.seleniumcourseonlteaw35;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WyszZad5Test {

    //Po utworzeniu konta na stronie https://hotel-testlab.coderslab.pl/en
    // zidentyfikuj następujące pola korzystając z lokalizatora By.cssSelector:
    //
    //MY PERSONAL INFORMATION
    //MY ADDRESSES

    @Test
    public void zad5() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement searchSignIn = driver.findElement(By.cssSelector("a.user_login"));
        searchSignIn.click();

        WebElement searchEmail = driver.findElement(By.cssSelector("input.email.email.email"));
        searchEmail.sendKeys("1@com.pl");

 //       WebElement searchCreateAnAccount = driver.findElement(By.id("SubmitCreate"));
 //       searchCreateAnAccount.click();

 //       WebElement searchMyPersonalInformation = driver.findElement(By.className("user_login"));
 //       searchMyPersonalInformation.click();

    }
}

