package com.jubair.NewYearTransportation;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jubair on 9/18/16.
 */
public class NewYearTransportation {
    Scanner input;

    /*public static void main(String[] args) {
        run();
    }
*/
    public String run() {
        int n, m;
        int []array = new int[30005];
        Arrays.fill(array, 0);

        n = input.nextInt();
        m = input.nextInt();

        for (int i = 1; i < n; i++) {
            array[i] = input.nextInt();
        }

        input.close();
        int i = 1;
        while (i < m){
            i += array[i];
        }

        if(i == m) {
            System.out.println("YES");
            return "YES";
        }
        else {
            System.out.println("NO");
            return "NO";
        }
    }

    public void testRunner(InputStream stream){
        input = new Scanner(stream);
    }
}
