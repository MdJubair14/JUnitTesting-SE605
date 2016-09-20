package com.jubair.Greatest;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by jubair on 9/18/16.
 */
public class Greatest {
    Scanner input;
/*
    public static void main(String[] args) {
        greatestFinder();
    }
*/

    public String greatestFinder(){
        float x, y, z;

        System.out.println("Enter the three variables x, y, z");

        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();
        input.close();

        if(x > y){
            if(x > z) {
                System.out.println("x is greatest");
                return "X";
            }
            else {
                System.out.println("z is greatest");
                return "Z";
            }
        }
        else {
            if(y > z) {
                System.out.println("y is greatest");
                return "Y";
            }
            else {
                System.out.println("z is greatest");
                return "Z";
            }
        }
    }

    public void testRunner(InputStream stream){
        input = new Scanner(stream);
    }
}
