// Leetcode Program Link: https://leetcode.com/problems/matrix-diagonal-sum/

class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum = 0;
        int N = mat.length;
        
        for(int row = 0; row < N; row++){
            for(int col = 0; col < N; col++){
                if(row == col)
                    sum += mat[row][col];
                else if(row + col == N - 1)
                    sum += mat[row][col];
            }
        }
        
        return sum;
    }
}