// Leetcode Program Link: https://leetcode.com/problems/power-of-three/

class Solution {
    public boolean isPowerOfThree(int n) {
        
        if(n == 1)
            return true;
        
        else if(n <= 0)
            return false;
        
        return (n % 3 == 0) && isPowerOfThree(n/3);
        
    }
}

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        return 1162261467 % n == 0;
    }
}