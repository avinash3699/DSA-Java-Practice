// Leetcode Problem Link: https://leetcode.com/problems/number-of-1-bits/

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int countOfOnes = 0;
        
        for(int ctr = 0; ctr < 32; ctr++){
            
            countOfOnes += n&1; 
            n = n >> 1;
            
        }
        
        return countOfOnes;
        
    }
}