// Print the elements of the RxC matrix layer by layer in clockwise manner from top-left.

/*
Input:
3 5
1 3 4 5 3
3 5 6 3 6
2 6 2 6 2

Output:
1 3 4 5 3 6 2 6 2 6 2 3 
5 6 3
*/

import java.util.*;

public class Main
{
    
    static void printElementsLayerByLayer(int[][] matrix, int R, int C){
        
        int noOfLayers = Math.min(R/2, C/2), layer = 0, copyLayersCount;
        copyLayersCount = noOfLayers;
        
        while(noOfLayers-->0){
            
            for(int col = layer; col < C-layer; col++)
                System.out.print(matrix[layer][col] + " ");
                
            for(int row = layer+1; row < R-layer; row++)
                System.out.print(matrix[row][C-layer-1] + " ");
        
            for(int col = C-layer-2; col > layer; col--)
                System.out.print(matrix[R-layer-1][col] + " ");
                
            for(int row = R-layer-1; row > layer; row--)
                System.out.print(matrix[row][layer] + " ");
                
            layer++;
            
            System.out.println();
        }

        if( (copyLayersCount&1) == 1 ){
            
            if(R < C){
                for(int col = R/2; col < C-layer; col++)
                    System.out.print(matrix[R/2][col] + " ");
            }
            else{
                for(int row = C/2; row < R-layer; row++)
                    System.out.print(matrix[row][layer] + " ");
            }
            
        }
        
    }
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt(), C = sc.nextInt();
		
		int matrix[][] = new int[R][C];
		
		for(int row = 0; row < R; row++)
		    for(int col = 0; col < C; col++)
		        matrix[row][col] = sc.nextInt();
		        
		printElementsLayerByLayer(matrix, R, C);
	}
}