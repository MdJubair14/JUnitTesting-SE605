package com.jubair.Juicer;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by jubair on 9/19/16.
 */
public class Juicer {
    Scanner input;

    /*public static void main(String[] args) {
        solve();
    }
*/
    public int solve(){
        int n, b, d;

        n = input.nextInt();
        b = input.nextInt();
        d = input.nextInt();

        int [] arr = new int[n];

        for (int i = 0; i < n; ++i)
        {
            arr[i] = input.nextInt();
        }

        int total = 0, squeezes = 0;
        for (int i = 0; i < n; ++i)
        {
            if(arr[i] <= b) squeezes += arr[i];
            if(squeezes > d) {
                total++;
                squeezes = 0;
            }
        }

        System.out.println(total);
        return total;
    }

    public void testRunner(InputStream stream){
        input = new Scanner(stream);
    }
}
