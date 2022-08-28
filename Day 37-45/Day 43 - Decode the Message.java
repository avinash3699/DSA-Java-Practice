// Leetcode Program Link: https://leetcode.com/problems/decode-the-message/

class Solution {
    public String decodeMessage(String key, String message) {
        
        String newKey = "";
        for(int index = 0; index < key.length(); index++){
            char currChar = key.charAt(index);
            if(currChar == ' ') continue;
            if(!newKey.contains(currChar+""))
                newKey += currChar;
        }
        
        String decodedString = "";
        for(int index = 0; index < message.length(); index++){
            
            char currChar = message.charAt(index);
            
            if(currChar == ' '){
                decodedString += ' ';
                continue;
            }
            
            decodedString += (char)('a' + newKey.indexOf(currChar));
            
        }
        
        return decodedString;
    }
}