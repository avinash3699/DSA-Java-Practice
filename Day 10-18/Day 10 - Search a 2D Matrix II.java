// Leetcode Problem Link: https://leetcode.com/problems/search-a-2d-matrix/
// Leetcode Problem Link: https://leetcode.com/problems/search-a-2d-matrix-ii/

// Leetcode Daily Challenge - 24/07/2022

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int R = matrix.length, C = matrix[0].length;
        int row = 0, col = C-1;
        
        while( (row < R) && (col >= 0) ){
            
            if(matrix[row][col] == target)
                return true;
            
            if(matrix[row][col] > target)
                col--;
            
            else
                row++;
            
        }
        
        return false;
    }
}