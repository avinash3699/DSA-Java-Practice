// Leetcode Problem Link: https://leetcode.com/problems/sqrtx/

// Newton’s method
class Solution {
    public int mySqrt(int x) {
        
        double guessNum = x;
        double squareRoot = 0.0;
        
        while(guessNum != 0){
            
            squareRoot = 0.5 * (guessNum + (x/guessNum));
            
            if(Math.abs(squareRoot - guessNum) < 1)
                break;
            
            guessNum = squareRoot;
            
        }
        
        return (int)squareRoot;
        
    }
}