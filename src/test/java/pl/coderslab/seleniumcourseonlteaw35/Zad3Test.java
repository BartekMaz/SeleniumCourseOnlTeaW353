package pl.coderslab.seleniumcourseonlteaw35;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zad3Test {
    @Test
    public void zad3(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
        webDriver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement login = webDriver.findElement(By.className("user_login"));
        login.click();
        WebElement email = webDriver.findElement(By.className("account_input"));
        email.sendKeys(Util.randomEmail());
        WebElement logginBtn = webDriver.findElement(By.cssSelector("#SubmitCreate"));
        logginBtn.click();
    }
}
