package pl.coderslab.seleniumcourseonlteaw35;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ZadDom3Test {

    //Pod linkiem https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html
    // dostępny jest formularz, którego wypełnianie i wysyłanie należy zautomatyzować.
    //
    //Wypełnij dane w formularzu:
    //
    //First name: Karol
    //Last name: Kowalski
    //Gender: Male
    //Date of birth: 05/22/2010
    //Address: Prosta 51
    //
    //Email: karol.kowalski@mailinator.com
    //Password: Pass123
    //Company: Coders Lab
    //Comment: To jest mój pierwszy automat testowy
    //
    //Zatwierdź formularz - SUBMIT
    @Test
    public void zad3() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");

        WebElement InputFirstName = driver.findElement(By.id("first-name"));
        InputFirstName.clear();
        InputFirstName.sendKeys("Karol");

        WebElement InputLastName = driver.findElement(By.id("last-name"));
        InputLastName.clear();
        InputLastName.sendKeys("Kowalski");
        
        WebElement InputGender = driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div/div/label[1]/input"));
        InputGender.click();

        WebElement InputDob = driver.findElement(By.id("dob"));
        InputDob.clear();
        InputDob.sendKeys("05/22/2010");

        WebElement InputAdress = driver.findElement(By.id("address"));
        InputAdress.clear();
        InputAdress.sendKeys("Prosta 51");

        WebElement InputEmail = driver.findElement(By.id("email"));
        InputEmail.clear();
        InputEmail.sendKeys("karol.kowalski@mailinator.com");

        WebElement InputPassword = driver.findElement(By.id("password"));
        InputPassword.clear();
        InputPassword.sendKeys("Pass123");

        WebElement InputCompany = driver.findElement(By.id("company"));
        InputCompany.clear();
        InputCompany.sendKeys("Coders Lab");

        WebElement InputComment = driver.findElement(By.id("comment"));
        InputComment.clear();
        InputComment.sendKeys("To jest mój pierwszy automat testowy");

        WebElement ButtonSubmit = driver.findElement(By.id("submit"));
        assertNotNull(ButtonSubmit);
        ButtonSubmit.click();

    }
}