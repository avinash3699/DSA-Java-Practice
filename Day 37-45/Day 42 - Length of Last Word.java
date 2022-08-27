// Leetcode Program Link: https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        
        int ptr1 = s.length() - 1, ptr2 = -1;
        
        while(s.charAt(ptr1) == ' ')
            ptr1--;
        
        ptr2 = ptr1;
        
        while( (ptr1 >= 0) && (s.charAt(ptr1) != ' ') )
            ptr1--;
        
        
        return ptr2 - ptr1;
        
    }
}