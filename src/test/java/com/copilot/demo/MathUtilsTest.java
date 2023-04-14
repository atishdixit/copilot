package com.copilot.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class MathUtilsTest {
    MathUtils mathUtils = new MathUtils();

    @Test
    public void testAdd() {
        int expected = 2;
        int actual = mathUtils.add(1, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void testSubtract() {
        int expected = 0;
        int actual = mathUtils.subtract(1, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 1;
        int actual = mathUtils.multiply(1, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivide() {
        int expected = 1;
        int actual = mathUtils.divide(1, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void testMod() {
        int expected = 0;
        int actual = mathUtils.mod(1, 1);
        assertEquals(expected, actual);
    }

    @Test
    public void testSquare() {
        int expected = 1;
        int actual = mathUtils.square(1);
        assertEquals(expected, actual);
    }

    @Test
    public void testIt(){



    }




}
