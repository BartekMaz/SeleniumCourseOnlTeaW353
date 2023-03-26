package pl.coderslab.seleniumcourseonlteaw35;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsExampleTes {
    @Test
    public void assertionsTest() {
        // given
        int a = 2;
        int b = 40;
        // when
        int actual = a + b;
        // then
//        if(actual != 42) {
//            throw new RuntimeException("assertion failed!");
//        }
        Assertions.assertTrue(1==1);
        assertFalse(1==2);
        assertEquals(42, actual);
        assertEquals(42, actual, "assertion failed!");
        assertEquals(3.14, 3.14, 0.01);
        assertNotEquals(42, 43);
        assertNotNull(new Object());
        assertNull(null);
        Object o = new Object();
        assertSame(o, o);
        assertNotSame(o, new Object());
    }
}
