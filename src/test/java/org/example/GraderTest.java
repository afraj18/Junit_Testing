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
    public void fiftyNineShouldReturnD(){
        Grader grader = new Grader();
        char value = grader.determineGrades(59);
        assertEquals('F',value);
    }
}