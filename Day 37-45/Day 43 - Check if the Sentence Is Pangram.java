// Leetcode Program Link: https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class Solution {
    public boolean checkIfPangram(String sentence) {
        
        Set<Character> set = new HashSet<>();
        
        for(int index = 0; index < sentence.length(); index++)
            set.add(sentence.charAt(index));
        
        return set.size() == 26;
        
    }
}