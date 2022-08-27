// Leetcode Program Link: https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        
        String newString = "";
        for(int index = 0; index < s.length(); index++){
            if(Character.isAlphabetic(s.charAt(index)))
                newString += (s.charAt(index) + "").toLowerCase();
            else if(Character.isDigit(s.charAt(index)))
                newString += s.charAt(index);
        }
        
        int ptr1 = 0, ptr2 = newString.length()-1;
        
        while(ptr1 <= ptr2){
            if(newString.charAt(ptr1++) != newString.charAt(ptr2--))
                return false;
        }
        
        return true;
        
    }
}