// Given two numbers 'a' and 'b'. Print the numbers between a and b(inclusive) which contains the digit 5.

// Input:
// a = 100
// b = 200

// Output: 
// 105, 115, 125, 135, 145, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 165, 175, 185, 195

import java.util.Scanner;

public class Q4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        printNum(a, b);

    }

    private static void printNum(int a, int b) {

        while(a <= b){

            boolean found = false;

            int num = a;
            while(num > 0){
                if(num%10 == 5){
                    found = true;
                    break;
                }
                num /= 10;
            }

            if(found)
                System.out.print(a + " ");

            a++;
        }

    }

}
