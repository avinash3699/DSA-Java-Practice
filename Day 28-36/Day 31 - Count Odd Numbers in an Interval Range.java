// Leetcode Program Link: https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

class Solution {
    public int countOdds(int low, int high) {
        
        return (high - low + (low&1) + (high&1)) / 2;
        
    }
}