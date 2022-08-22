// Leetcode Program Link: https://leetcode.com/problems/power-of-four/

// Recursion

class Solution {
    public boolean isPowerOfFour(int n) {
        
        if(n == 1)
            return true;
        
        else if(n == 0)
            return false;
        
        return (n%4 == 0) && isPowerOfFour(n/4);
        
    }
}