// Leetcode Program Link: https://leetcode.com/problems/goal-parser-interpretation/

class Solution {
    public String interpret(String command) {
        
        String interpretedString = "";
        
        for(int index = 0; index < command.length(); index++){
            
            if(command.charAt(index) == 'G')
                interpretedString += "G";
            
            else if( ((index + 1) < command.length()) && (command.substring(index, index+2).equals("()")) ){
                interpretedString += "o";
                index++;
            }
            
            else if( ((index + 3) < command.length()) && (command.substring(index, index+4).equals("(al)")) ){
                interpretedString += "al";
                index += 2;
            }
            
        }
        
        return interpretedString;
        
    }
}