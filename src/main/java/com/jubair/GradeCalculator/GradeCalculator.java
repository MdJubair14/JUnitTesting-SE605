package com.jubair.GradeCalculator;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by jubair on 9/18/16.
 */
public class GradeCalculator {

    Scanner input;

    /*public static void main(String[] args) {
        gradeCalc();
    }
*/
    public String gradeCalc(){
        char grade;
        int s1, s2, s3, s4, total;
        float average;
        System.out.println("Enter the marks of 4 subjects");

        s1 = input.nextInt();
        s2 = input.nextInt();
        s3 = input.nextInt();
        s4 = input.nextInt();

        if (s1 < 40 || s2 < 40 || s3 < 40 || s4 < 40) {
            System.out.println("Student has failed");
            return "F";
        }
            else{
            total = s1 + s2 + s3 + s4;
            average = (float) (total/4.0);

            if(average > 80.0)
                grade = 'A';
            else if (average >= 70.0)
                grade = 'B';
            else if (average >= 60.0)
                grade = 'C';
            else if (average >= 50.0)
                grade = 'D';
            else if (average >= 45.0)
                grade = 'E';
            else grade = 'F';

            switch (grade){
                case 'A':
                    System.out.println("Student has got A grade");
                    return "A";
                case 'B':
                    System.out.println("Student has got B grade");
                    return "B";
                case 'C':
                    System.out.println("Student has got C grade");
                    return "C";
                case 'D':
                    System.out.println("Student has got D grade");
                    return "D";
                case 'E':
                    System.out.println("Student has got E grade");
                    return "E";
                case 'F':
                    System.out.println("Student has got F grade");
                    return "F";

            }
            return "F";
        }


    }

    public void testRunner(InputStream stream){
        input = new Scanner(stream);
    }
}
