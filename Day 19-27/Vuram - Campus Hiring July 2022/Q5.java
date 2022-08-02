// Given an odd integer N. Print the pattern shown below.

// Input:
// N = 5

// Output:
// *****
// ***
// *

import java.util.Scanner;

public class Q5 {
    
    public static void main(String[] args) {
        
        int N = new Scanner(System.in).nextInt();
        printPattern(N);

    }

    private static void printPattern(int N) {

        while(N > 0){

            // for(int ctr = 1; ctr <= N; ctr++)
            //     System.out.print("*");
            // System.out.println();
            
            System.out.println("*".repeat(N));

            N -= 2;

        }

    }

}
