package com.jubair.KingMoves;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Created by jubair on 9/18/16.
 */
public class KingMoves {
    Scanner input;

    /*public static void main(String[] args) {
        solve();
    }
*/
    public int solve(){
        String s;

        s = input.nextLine();
        input.close();

        int x, y;
        if(s.charAt(0) == 'a' || s.charAt(0) == 'h'){
            x = 2;
        }
        else{
            x = 3;
        }

        if(s.charAt(1) == '1' || s.charAt(1) == '8'){
            y = 2;
        }
        else{
            y = 3;
        }

        System.out.println(x*y-1);
        return x*y-1;
    }

    public void testRunner(InputStream stream){
        input = new Scanner(stream);
    }
}
