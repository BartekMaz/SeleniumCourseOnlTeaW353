package pl.coderslab.seleniumcourseonlteaw35;

// test https://duckduckgo.com/ search

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.fail;

public class FunctionsZad1KopiaTest {
    @Test
    public void zad1(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        webDriver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement login = webDriver.findElement(By.className("user_login"));
        login.click();
        WebElement email = webDriver.findElement(By.className("account_input"));
        email.sendKeys(Util.randomEmail());
        WebElement logginBtn = webDriver.findElement(By.cssSelector("#SubmitCreate"));
        logginBtn.click();

        WebElement customerFirstname = webDriver.findElement(By.id("customer_firstname"));
        if (!customerFirstname.isEnabled() || !customerFirstname.isDisplayed()) {
            fail("element not interactable");
        }
        customerFirstname.sendKeys("Roman");

        WebElement customerLastname = webDriver.findElement(By.id("customer_lastname"));
        Util.assertVisibleAndEnabled(customerLastname);
        customerLastname.sendKeys("Nowak");

        WebElement customerEmail = webDriver.findElement(By.id("email"));
        Util.assertVisibleAndEnabled(customerEmail);

        WebElement customerPassword = webDriver.findElement(By.id("passwd"));
        Util.assertVisibleAndEnabled(customerPassword);

        WebElement buttonRegister = webDriver.findElement(By.id("submitAccount"));
        Util.assertVisibleAndEnabled(buttonRegister);
    }
}
