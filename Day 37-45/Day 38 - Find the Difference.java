// Leetcode Program Link: https://leetcode.com/problems/find-the-difference/

class Solution {
    public char findTheDifference(String s, String t) {
        
        int xorVal = 0;
        
        for(int index = 0; index < s.length(); index++)
            xorVal ^= s.charAt(index);
        
        for(int index = 0; index < t.length(); index++)
            xorVal ^= t.charAt(index);
        
        return (char)xorVal;
        
    }
}