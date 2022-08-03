// Print the sum of the matrix border elements.

import java.util.Scanner;

public class Q5 {
    
    static int R, C;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        R = sc.nextInt();
        C = sc.nextInt();
        int[][] matrix = new int[R][C];

        for(int row = 0; row < R; row++)
            for(int col = 0; col < C; col++)
                matrix[row][col] = sc.nextInt();

        int borderSum = printBorderSum(matrix);
        System.out.print(borderSum);
        
    }

    private static int printBorderSum(int[][] matrix) {

        int sum = 0; 
        
        for(int row = 0; row < R; row++){
            for(int col = 0; col < C; col++){
                if( (row == 0) || (row == R-1) || (col == 0) || (col == C-1) )
                    sum += matrix[row][col];
            }
        }

        return sum;

    }

}