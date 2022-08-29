// Leetcode Program Link: https://leetcode.com/problems/implement-strstr/

class Solution {
    public int strStr(String haystack, String needle) {
        
        for(int index = 0; index <= haystack.length() - needle.length(); index++){
            
            if(haystack.substring(index, index+needle.length()).equals(needle))
                return index;
            
        }
        
        return -1;
        
    }
}