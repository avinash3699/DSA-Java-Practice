// Leetcode Program Link: https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/

class Solution {
    public String freqAlphabets(String s) {
        
        String newString = "";
        
        for(int index = 0; index < s.length(); index++){
            
            if( (index+2 < s.length() && (s.charAt(index+2) == '#')) ){
                int val = Integer.parseInt(s.substring(index, index+2));
                newString += (char)('a' + val - 1);
                index += 2;
            }
               
            else
                newString += (char)('a' + Integer.parseInt(s.charAt(index)+"") - 1);
            
        }
               
        return newString;
        
    }
}