package com.jubair.KefaAndFirstStep;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by jubair on 9/19/16.
 */
public class KefaAndFirstStep {
    Scanner input;
    /*
    public static void main(String[] args) {
        solve();
    }
*/
    public int solve(){
        int n;

        n = input.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; ++i)
        {
            arr[i] = input.nextInt();
        }

        int cnt = 1, maximum = -1;
        for (int i =1; i < n; ++i)
        {
            if(arr[i] < arr[i-1]) {
                if(cnt > maximum) maximum = cnt;
                cnt = 1;
            }
            else cnt++;
        }

        maximum = Math.max(maximum,cnt);
        System.out.println(maximum);
        return maximum;
    }

    public void testRunner(InputStream stream){
        input = new Scanner(stream);
    }
}
