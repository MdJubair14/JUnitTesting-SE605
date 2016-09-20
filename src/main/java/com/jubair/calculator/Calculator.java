package com.jubair.calculator;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by jubair on 9/18/16.
 */
public class Calculator {
    Scanner input;

    /*public static void main(String[] args) {
        calculate();
    }*/

    public int calculate(){
        int a, b, c, d;

        System.out.println("Enter the two variables a, b");

        a = input.nextInt();
        b = input.nextInt();

        System.out.println("Enter the option 1: Addition\n2: Subtraction\n3: Multiplication\n4: Division");
        c = input.nextInt();
        input.close();

        switch (c){
            case 1: d = a+b;
                System.out.println("Addition of two number = " + d);
                return d;
            case 2: d = a-b;
                System.out.println("Subtraction of two number = " + d);
                return d;
            case 3: d = a*b;
                System.out.println("Multiplication of two number = " + d);
                return d;
            case 4: d = a/b;
                System.out.println("Division of two number = " + d);
                return d;

        }
        return -1;
    }

    public void testRunner(InputStream stream){
        input = new Scanner(stream);

    }
}
