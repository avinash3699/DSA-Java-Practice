// Leetcode Problem Link: https://leetcode.com/problems/sqrtx/

class Solution {
    public int mySqrt(int x) {
        
        long squareRoot = 1;
        
        while(squareRoot * squareRoot <= x){
            squareRoot++;
        }
        
        return (int)squareRoot - 1;
        
    }
}