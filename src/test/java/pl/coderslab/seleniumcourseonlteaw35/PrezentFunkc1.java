package pl.coderslab.seleniumcourseonlteaw35;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PrezentFunkc1 {


    @Test
    public void getTextAttributeTag() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://pl.wikipedia.org/");
        WebElement element = driver.findElement(By.id("main-page-column1"));
        System.out.println(element.getText());

//        driver.get("https://pl.wikipedia.org/");
//        String atrybut = driver.findElement(By.id("main-page-content")).getAttribute("class");
//        System.out.println(atrybut);

//        driver.get("https://pl.wikipedia.org/");
//        String tag = driver.findElement(By.id("main-page-content")).getTagName();//       System.out.println(tag);

    }
}
