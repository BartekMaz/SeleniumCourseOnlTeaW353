package pl.coderslab.seleniumcourseonlteaw35;

import org.openqa.selenium.WebElement;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.fail;

public class Util {
    public static String randomEmail() {
        return UUID.randomUUID().toString() + "@mail.pl";
    }

    public static void assertVisibleAndEnabled(WebElement element) {
        if (!element.isEnabled() || !element.isDisplayed()) {
            fail("element not visible or not enabled");
        }
    }
}
