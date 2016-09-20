package com.jubair.Chocolate;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by jubair on 9/19/16.
 */
public class Chocolate {
    Scanner input;

    /*public static void main(String[] args) {
        solve();
    }
*/
    public int solve(){
        int n;
        n = input.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; ++i)
        {
            arr[i] = input.nextInt();
        }

        int first = -1, second = -1;
        int cnt = 1;
        int res = 1;
        for (int i = 0; i < n; ++i)
        {
            if(arr[i] == 1) {
                first = i;
                break;
            }
        }
        if(first == -1){
            System.out.println(0);
            return 0;
        }
        for(int j = n-1; j >= first; j--)
        {
            if(arr[j] == 1){
                second = j;
                break;
            }
        }
        if(first == second){
            System.out.println(res);
            return res;
        }

        for (int i = first+1; i <= second; ++i)
        {
            if(arr[i] == 1){
                res *= cnt;
                cnt = 1;
            }
            else{
                cnt++;
            }
        }
        System.out.println(res);
        return res;
    }

    public void testRunner(InputStream stream){
        input = new Scanner(stream);
    }
}
