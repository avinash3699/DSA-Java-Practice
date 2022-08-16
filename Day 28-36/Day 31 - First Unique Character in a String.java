// Leetcode Problem Link: https://leetcode.com/problems/first-unique-character-in-a-string/

class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        for(int index = 0; index < s.length(); index++){
            
            char currChar = s.charAt(index);
            
            if(map.containsKey(currChar))
                map.put(currChar, -1);
            
            else
                map.put(currChar, index);
            
        }
        
        for(Character ch: map.keySet()){
            if(map.get(ch) != -1)
                return map.get(ch);
        }        
        
        return -1;
        
    }
}