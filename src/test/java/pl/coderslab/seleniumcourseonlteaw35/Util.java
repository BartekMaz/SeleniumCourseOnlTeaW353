package pl.coderslab.seleniumcourseonlteaw35;

import java.util.UUID;

public class Util {
    public static String randomEmail() {
        return UUID.randomUUID().toString() + "@mail.pl";
    }
}
