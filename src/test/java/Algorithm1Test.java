package test.java;

import main.java.Algorithm1;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Algorithm1Test {

    @Test
    public void algorithm() {
        Algorithm1 algorithm1 = new Algorithm1(200, 100, 10);
        assertNotEquals(0, algorithm1.soldiers);
        assertNotEquals(0, algorithm1.count);
        assertNotEquals(0, algorithm1.iterations);

    }
}