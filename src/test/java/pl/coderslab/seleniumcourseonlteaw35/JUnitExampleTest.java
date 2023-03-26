package pl.coderslab.seleniumcourseonlteaw35;

import org.junit.jupiter.api.*;

public class JUnitExampleTest {
    @Test
    public void firstTest() {
        // test code
        System.out.println("firstTest");
    }

    @Test
    public void secondTest() {
        // test code
        System.out.println("secondTest");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("beforeEach");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("afterEach");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }
}
