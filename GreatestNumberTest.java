package com.bnmit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class GreatestNumberTest {

    private GreatestNumber gn;

    @BeforeEach
    void setUp() {
        gn = new GreatestNumber();
    }

    @Test
    @DisplayName("Should find the greatest when it's the second number")
    void testFindGreatestStandard() {
        assertEquals(25, gn.findGreatest(10, 25, 15));
    }

    @Test
    @DisplayName("Should work when the first number is the greatest")
    void testFirstIsGreatest() {
        assertEquals(100, gn.findGreatest(100, 50, 75));
    }

    @Test
    @DisplayName("Should work when the third number is the greatest")
    void testThirdIsGreatest() {
        assertEquals(50, gn.findGreatest(10, 20, 50));
    }

    @Test
    @DisplayName("Should handle negative numbers correctly")
    void testNegativeNumbers() {
        assertEquals(-1, gn.findGreatest(-10, -1, -5));
    }

    @Test
    @DisplayName("Should return the same value if all numbers are equal")
    void testAllEqual() {
        assertEquals(7, gn.findGreatest(7, 7, 7));
    }
}