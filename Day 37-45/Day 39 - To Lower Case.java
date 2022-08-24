// Leetcode Program Link: https://leetcode.com/problems/to-lower-case/

class Solution {
    public String toLowerCase(String s) {
        
        String lowerCaseString = "";

        for(int index = 0; index < s.length(); index++){
            
            char currChar = s.charAt(index);
            
            if( (currChar >= 'A') && (currChar <= 'Z') )
                lowerCaseString += (char)(currChar + 32);
            
            else
                lowerCaseString += currChar;
            
        }
        
        return lowerCaseString;
    }
}


class Solution {
    public String toLowerCase(String s) {
        
        return s.toLowerCase();
        
    }
}