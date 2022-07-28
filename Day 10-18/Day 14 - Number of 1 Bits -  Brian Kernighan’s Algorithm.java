// Leetcode Problem Link: https://leetcode.com/problems/number-of-1-bits/

// Brian Kernighan’s Algorithm: 
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        int countOfOnes = 0;
        
        while(n != 0){
            
            n = n & (n-1);
            countOfOnes++;
            
        }
        
        return countOfOnes;
        
    }
}
