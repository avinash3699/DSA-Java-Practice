// Leetcode Program Link: https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        
        Arrays.sort(arr);
        
        int d = arr[1] - arr[0];
        for(int index = 1; index < arr.length-1; index++){
            
            if(arr[index+1] - arr[index] != d)
                return false;
            
        }
        
        return true;
        
    }
}