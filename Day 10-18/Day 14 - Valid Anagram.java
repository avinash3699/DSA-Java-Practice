// Leetcode Problem Link: https://leetcode.com/problems/valid-anagram/

class Solution {
    
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        
        Map<Character, Integer> sFreq = new HashMap<>();
        
        for(int index = 0; index < s.length(); index++){
            
            char currentCharacter = s.charAt(index);
            sFreq.put(currentCharacter, sFreq.getOrDefault(currentCharacter, 0) + 1);
            
        }
        
        for(int index = 0; index < t.length(); index++){
            
            char currentCharacter = t.charAt(index);
            if(sFreq.containsKey(currentCharacter))
                sFreq.put(currentCharacter, sFreq.get(currentCharacter) - 1);
            else
                return false;
            
        }
        
        for(char key: sFreq.keySet()){
            if(sFreq.get(key) != 0)
                return false;
        }
        
        return true;
        
    }
}