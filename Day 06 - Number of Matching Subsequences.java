// Leetcode Problem Link: https://leetcode.com/problems/number-of-matching-subsequences/

// Leetcode Daily Challenge - 20/07/2022

class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        
        int subsequenceCount = 0;
        
        Map<String, Integer> wordCount = new HashMap<>();
        for(String word: words){
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        for(String word: wordCount.keySet()){
            
            int wordIndex = 0;
            
            for(int stringIndex = 0; (stringIndex < s.length()) && (wordIndex < word.length()); stringIndex++){
                if(s.charAt(stringIndex) == word.charAt(wordIndex))
                    wordIndex++;
            }
            if(wordIndex == word.length())
                subsequenceCount += wordCount.get(word);
            
        }
        
        return subsequenceCount;
        
    }
}