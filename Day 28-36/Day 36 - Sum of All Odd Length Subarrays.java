// Leetcode Program Link: https://leetcode.com/problems/sum-of-all-odd-length-subarrays/

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int sum = 0;
        
        for(int ind1 = 0; ind1 < arr.length; ind1++){
            
            for(int ind2 = ind1+1; ind2 < arr.length+1; ind2 += 2){
                
                for(int ind3 = ind1; ind3 < ind2; ind3++)
                    sum += arr[ind3];
                
            }
            
        }
        
        return sum;
        
    }
}