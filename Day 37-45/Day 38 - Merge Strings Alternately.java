// Leetcode Program Link: https://leetcode.com/problems/merge-strings-alternately/

class Solution {
    public String mergeAlternately(String word1, String word2) {

        String maxString = "", mergedString = "";
        
        if(word1.length() > word2.length()){
            maxString = word1;
        }
        else{
            maxString = word2;
        }
        
        int index;
        for(index = 0; index < Math.min(word1.length(), word2.length()); index++)
            mergedString += word1.charAt(index) + "" + word2.charAt(index) + "";
        
        mergedString += maxString.substring(index, maxString.length());
        
        return mergedString;
        
    }
}