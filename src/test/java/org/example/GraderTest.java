package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GraderTest {
@Test
    public void fiftyNineShouldReturnF(){
        Grader grader = new Grader();
        char value = grader.determineGrades(59);
        assertEquals('F',value);
    }
    @Test
    public void sixyNineShouldReturnD(){
        Grader grader = new Grader();
        char value = grader.determineGrades(69);
        assertEquals('D',value);
    }
    @Test
    public void seventyNineShouldReturnC(){
        Grader grader = new Grader();
        char value = grader.determineGrades(79);
        assertEquals('C',value);
    }
    @Test
    public void eightyNineShouldReturnB(){
        Grader grader = new Grader();
        char value = grader.determineGrades(89);
        assertEquals('B',value);
    }
    @Test
    public void eightyNineShouldReturnA(){
        Grader grader = new Grader();
        char value = grader.determineGrades(99);
        assertEquals('A',value);
    }

    @Test
    public void throwExceptionWhenNegativeNumberPassed(){
        Grader grader = new Grader();
        assertThrows(IllegalArgumentException.class,
                ()->{
                    grader.determineGrades(-5);
                });
    }
}