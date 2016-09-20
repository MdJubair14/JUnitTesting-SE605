package com.jubair.PrimeFinder;

/**
 * Created by jubair on 9/18/16.
 */
public class PrimeFinder {
    static boolean prime;

    /*public static void main(String[] args) {
        int num, sum, count;
        boolean flag;
        sum = count = 0;
        System.out.println("Prime number between 1 and 100 are");
        for (num = 1; num <= 50; num++){
            flag = checkPrime(num);
            *//*if (flag){
                System.out.println(num);
                sum += num;
                count++;
            }*//*
        }
    }
*/
    public boolean checkPrime(int n) {
        int srt, d;
        srt = (int)Math.sqrt(n);
        d = 2;
        while (d <= srt){
            if(n%d == 0)
                break;
            d++;
        }
        if(d > srt){
            return true;
        }
        else{
            return false;
        }
    }
}
