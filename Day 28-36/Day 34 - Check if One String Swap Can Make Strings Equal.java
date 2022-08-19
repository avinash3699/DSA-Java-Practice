// Leetcode Program Link: https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/

// Bruteforce
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        if(s1.length() != s2.length()) return false;
        
        for(int ind1 = 0; ind1 < s1.length(); ind1++){
            for(int ind2 = 0; ind2 < s1.length(); ind2++){
                char[] arr = s1.toCharArray();
                arr[ind1] = s1.charAt(ind2);
                arr[ind2] = s1.charAt(ind1);
                
                String s = "";
                for(int index = 0; index < s1.length(); index++)
                    s += arr[index];
                
                if(s.equals(s2))
                    return true;
                
            }
        }
        
        return false;
        
    }
}