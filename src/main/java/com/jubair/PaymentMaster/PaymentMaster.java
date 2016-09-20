package com.jubair.PaymentMaster;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by jubair on 9/18/16.
 */
public class PaymentMaster {
    Scanner input;

   /* public static void main(String[] args) {
        paymentCalc();
    }
*/
    public double paymentCalc() {
        int work;
        double payment = 0;

        work = input.nextInt();
        input.close();

        if(work > 0){
            payment = 40;
        }
        if(work > 20){
            if(work <= 30){
                payment = payment + (work -25) * .5;
            }
            else{
                payment = payment + 50 + (work - 30) * 0.1;
                if(payment >= 3000){
                    payment = payment * 0.9;
                }
            }
        }
        System.out.println("Final payment " + payment);
        return payment;
    }

    public void testRunner(InputStream stream){
        input = new Scanner(stream);
    }
}
