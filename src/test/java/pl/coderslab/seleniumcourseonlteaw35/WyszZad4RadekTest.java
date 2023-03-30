package pl.coderslab.seleniumcourseonlteaw35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class WyszZad4RadekTest {
        public static void main(String[] args) {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();
                driver.get("https://hotel-testlab.coderslab.pl/en/");
                WebElement signInButton = driver.findElement(By.className("user_login"));
                signInButton.click();
                WebElement emailAddressInput = driver.findElement(By.className("is_required"));
                emailAddressInput.sendKeys("test@test121233431.com");
                driver.findElement(By.id("SubmitCreate")).click();
                WebElement customerNameInput = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/form/div[1]/div[2]/input"));
                customerNameInput.sendKeys("Jan");
                WebElement customerLastNameInput = driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]"));
                customerLastNameInput.sendKeys("Sobieski");
                WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"email\"]"));
                emailInput.clear();
                emailInput.sendKeys("test@test121233431.com");
                WebElement passwordInput = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/form/div[1]/div[5]/input"));
                passwordInput.sendKeys("12345");
                WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"submitAccount\"]"));
                submitButton.click();
                WebElement myPersonalInformationButton = driver.findElement(By.cssSelector("#center_column > div > div > ul > li:nth-child(4) > a > span"));
                WebElement myAddressButton = driver.findElement(By.cssSelector("#center_column > div > div > ul > li:nth-child(5) > a > span"));
//        driver.quit();
        }
}