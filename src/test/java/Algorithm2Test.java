package test.java;

import main.java.Algorithm1;
import main.java.Algorithm2;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Algorithm2Test {

    @Test
    public void algorithm() {
        Algorithm2 algorithm2 = new Algorithm2(32, 2, 1);
        assertNotEquals(0, algorithm2.soldiers);
        assertNotEquals(0, algorithm2.count);
        assertNotEquals(0, algorithm2.iterations);

        assertTrue(algorithm2.soldiers <= Integer.MAX_VALUE);
        assertTrue(algorithm2.count <= Integer.MAX_VALUE);
        assertTrue(algorithm2.iterations <= Integer.MAX_VALUE);

        double log = Math.log10(algorithm2.soldiers) / Math.log10(algorithm2.count);
        int largestPower = (int) Math.floor(log);
        int remaining    = algorithm2.soldiers - (int) Math.pow(algorithm2.count, largestPower);

        assertEquals(2 * remaining + 1, algorithm2.algorithm());
    }

}