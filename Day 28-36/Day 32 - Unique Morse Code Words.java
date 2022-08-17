// Leetcode Program Link: https://leetcode.com/problems/unique-morse-code-words/

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> uniqueCodes = new HashSet<>();
        
        for(String word: words){
            
            String morseCode = "";
            
            for(int ind = 0; ind < word.length(); ind++)
                morseCode += codes[word.charAt(ind) - 'a'];
            
            uniqueCodes.add(morseCode);
            
        }
        
        return uniqueCodes.size();
        
    }
}