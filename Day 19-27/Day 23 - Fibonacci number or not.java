// Check if a given number is Fibonacci number or not.

import java.util.Scanner;

public class Solution{

    private static boolean isFibonacci(int n) {

        return isPerfectSquare(5*n*n - 4) || isPerfectSquare(5*n*n + 4);

    }

    private static boolean isPerfectSquare(int n) {
        
        int sqrt = (int)(Math.sqrt(n));
        return sqrt*sqrt == n;

    }

    public static void main(String[] args) {
        
        int N = new Scanner(System.in).nextInt();
        
        System.out.println(isFibonacci(N)?"Yes":"No");

    }

}