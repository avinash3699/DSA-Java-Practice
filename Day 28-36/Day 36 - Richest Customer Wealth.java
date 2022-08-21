// Leetcode Program Link: https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int maxWealth = Integer.MIN_VALUE;
        
        for(int row = 0; row < accounts.length; row++){
            
            int wealth = 0;
            
            for(int col = 0; col < accounts[0].length; col++)
                wealth += accounts[row][col];
            
            maxWealth = Math.max(wealth, maxWealth);
            
        }
        
        return maxWealth;
        
    }
}