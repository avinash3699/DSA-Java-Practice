// Multiplication of two numbers without using *

import java.util.Scanner;

public class Q1 {    

    static int getProduct(int a, int b){

        return (int) (a/(1.0/b));

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.print(getProduct(a, b));

    }

}
