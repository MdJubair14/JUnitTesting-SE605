package com.jubair.CheckPoint;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jubair on 9/18/16.
 */
public class CheckPoint {

    Scanner input;

    /*public static void main(String[] args) {
        solve();
    }
*/
    public int solve(){
        int n, a;

        n = input.nextInt();
        a = input.nextInt();

        int []checkpoints = new int[n];
        for (int i = 0; i < n; i++) {
            checkpoints[i] = input.nextInt();
        }

        Arrays.sort(checkpoints);
        if (n == 1) {
            System.out.println(0);
            return 0;
        }

        else if(n > 2){
            int r1 = Math.min( Math.abs(a - checkpoints[0]), Math.abs(a-checkpoints[n-2])) + checkpoints[n-2] - checkpoints[0];
            int r2 = Math.min( Math.abs(a - checkpoints[1]), Math.abs(a - checkpoints[n-1]) + checkpoints[n-1] - checkpoints[1]);
            int result = Math.min(r1, r2);
            System.out.println(result);
            return result;
        }
        else {
            System.out.println(0);
            return 0;
        }
    }

    public void testRunner(InputStream stream){
        input = new Scanner(stream);
    }
}
