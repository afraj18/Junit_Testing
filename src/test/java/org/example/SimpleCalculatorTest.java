package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {

        @Test
        public void twoPlusTwoEqualFour(){
            var calculator = new SimpleCalculator();
            assertEquals(4,calculator.add(2,2));
//            assertNotEquals(5,calculator.add(2,2));
//            assertTrue(calculator.add(2,2)==4?true:false);
//            assertNotNull(calculator.add(2,2));
        }
    @Test
    public void threePlusSevenEqualFour(){
        var calculator = new SimpleCalculator();
        assertEquals(10,calculator.add(3,7));
//            assertNotEquals(5,calculator.add(2,2));
//            assertTrue(calculator.add(2,2)==4?true:false);
//            assertNotNull(calculator.add(2,2));
    }
}