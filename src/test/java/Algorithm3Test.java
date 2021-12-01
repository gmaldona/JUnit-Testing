package test.java;

import main.java.Algorithm1;
import main.java.Algorithm3;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Algorithm3Test {

    @Test
    public void algorithm() {
        Algorithm3 algorithm3 = new Algorithm3(32, 2, 1);
        assertNotEquals(0, algorithm3.soldiers);
        assertNotEquals(0, algorithm3.count);
        assertNotEquals(0, algorithm3.iterations);

        assertTrue(algorithm3.soldiers <= Integer.MAX_VALUE);
        assertTrue(algorithm3.count <= Integer.MAX_VALUE);
        assertTrue(algorithm3.iterations <= Integer.MAX_VALUE);

        double log = Math.log10(algorithm3.soldiers) / Math.log10(algorithm3.count);
        int largestPower = (int) Math.floor(log);
        int remaining    = algorithm3.soldiers - (int) Math.pow(algorithm3.count, largestPower);

        assertEquals(2 * remaining + 1, algorithm3.algorithm());
    }
}