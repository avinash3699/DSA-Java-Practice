// Leetcode Program Link: https://leetcode.com/problems/ransom-note/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> ransomMap = getMap(ransomNote);
        Map<Character, Integer> magazineMap = getMap(magazine);
        
        for(Character key: ransomMap.keySet()){
            if(magazineMap.containsKey(key)){
                if(magazineMap.get(key) < ransomMap.get(key))
                    return false;
            }
            else
                return false;
        }
        
        return true;
    }
    
    public HashMap getMap(String string){
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int index = 0; index < string.length(); index++){
            char currChar = string.charAt(index);
            map.put(currChar, map.getOrDefault(currChar, 0) + 1);
        }
        
        return map;
        
    }
    
}