package test.java;

import main.java.Algorithm1;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Algorithm1Test {

    @Test
    public void algorithm() {
        Algorithm1 algorithm1 = new Algorithm1(50, 2, 1);
        assertNotEquals(0, algorithm1.soldiers);
        assertNotEquals(0, algorithm1.count);
        assertNotEquals(0, algorithm1.iterations);

        assertTrue(algorithm1.soldiers <= Integer.MAX_VALUE);
        assertTrue(algorithm1.count <= Integer.MAX_VALUE);
        assertTrue(algorithm1.iterations <= Integer.MAX_VALUE);

        double log = Math.log10(algorithm1.soldiers) / Math.log10(algorithm1.count);
        int largestPower = (int) Math.floor(log);
        int remaining    = algorithm1.soldiers - (int) Math.pow(algorithm1.count, largestPower);

        assertEquals(2 * remaining + 1 , algorithm1.algorithm());
    }
}