package test.java;

import main.java.Algorithm1;
import main.java.Algorithm3;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Algorithm3Test {

    @Test
    public void algorithm() {
        Algorithm3 algorithm1 = new Algorithm3(200, 100, 10);
        assertNotEquals(0, algorithm1.soldiers);
        assertNotEquals(0, algorithm1.count);
        assertNotEquals(0, algorithm1.iterations);

    }
}