// Leetcode Program Link: https://leetcode.com/problems/reshape-the-matrix/

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int R = mat.length, C = mat[0].length;
        int[][] reshapedMatrix = new int[r][c];
        
        if(R*C != r*c)
            return mat;
        
        int row = 0, col = 0;
        for(int newRow = 0; newRow < r; newRow++){
            for(int newCol = 0; newCol < c; newCol++){
                
                reshapedMatrix[newRow][newCol] = mat[row][col];
                
                col++;
                if(col == C){
                    col = 0;
                    row++;
                }
                
            }
        }
        
        return reshapedMatrix;
    }
}