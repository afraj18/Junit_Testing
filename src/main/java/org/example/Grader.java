package org.example;

public class Grader {
    public char  determineGrades(int numberGrade){
        if(numberGrade<0){
            throw new IllegalArgumentException("Number invalid");
        }
        else if(numberGrade<60){
            return 'F';
        }
        else if(numberGrade<70){
            return 'D';
        }
        else if(numberGrade<80){
            return 'C';
        }
        else if(numberGrade<60){
            return 'B';
        }
        else{
            return 'A';
        }
    }
}
