package pl.coderslab.seleniumcourseonlteaw35.examples;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        String[] arrString = new String[0];
        List<String> listString = new ArrayList<>();
        listString.add("ala");
        System.out.println("size="+listString.size());
        listString.add("ma");
        System.out.println("size="+listString.size());
        listString.add("kota");
        System.out.println("size="+listString.size());
        System.out.println(listString);
    }
}
