// Leetcode Problem Link: https://leetcode.com/problems/find-the-closest-palindrome/
// Explanation: https://leetcode.com/problems/find-the-closest-palindrome/discuss/2339074/Java-easy-understanding-solution-with-explanation

// 5 Component Approach
class Solution {
    
    static long getPalindromeFromHalf(long num, int len){

        long firstHalfCopy = num;
        
        if((len&1) == 1)
            firstHalfCopy /= 10;
        
        while(firstHalfCopy > 0){
            num = (num*10) + (firstHalfCopy%10);
            firstHalfCopy /= 10;
        }
        
        return num;
        
    }
    
    public String nearestPalindromic(String n) {
        
        Long num = Long.valueOf(n);
        
        long comp1 = (long)Math.pow(10, n.length() - 1) - 1;
        long comp2 = (long)Math.pow(10, n.length() ) + 1;
        
        long firstHalf = (long) (num / (Math.pow(10, n.length()/2)));
        
        long comp3 = getPalindromeFromHalf(firstHalf - 1, n.length());
        long comp4 = getPalindromeFromHalf(firstHalf, n.length());
        long comp5 = getPalindromeFromHalf(firstHalf + 1, n.length());
        
        long minPalindrome = Long.MAX_VALUE;
        long minPalindromeDiff = Long.MAX_VALUE;
                
        long difference = Math.abs(comp1-num);
        if( (difference != 0) && (difference < minPalindromeDiff) ){
            minPalindrome = comp1;
            minPalindromeDiff = difference;
        }
        
        difference = Math.abs(comp2-num);
        if( (difference != 0) && (difference < minPalindromeDiff) ){
            minPalindrome = comp2;
            minPalindromeDiff = difference;
        }
        
        difference = Math.abs(comp3-num);
        if( (difference != 0) && (difference < minPalindromeDiff) ){
            minPalindrome = comp3;
            minPalindromeDiff = difference;
        }
        
        difference = Math.abs(comp4-num);
        if( (difference != 0) && (difference < minPalindromeDiff) ){
            minPalindrome = comp4;
            minPalindromeDiff = difference;
        }
        
        difference = Math.abs(comp5-num);
        if( (difference != 0) && (difference < minPalindromeDiff) ){
            minPalindrome = comp5;
            minPalindromeDiff = difference;
        }

        return String.valueOf(minPalindrome);
        
    }
}