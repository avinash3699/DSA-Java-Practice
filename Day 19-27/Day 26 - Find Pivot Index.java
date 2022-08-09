// Leetcode Program Link: https://leetcode.com/problems/find-pivot-index/
//                        https://leetcode.com/problems/find-the-middle-index-in-array/

class Solution {
    
    public int pivotIndex(int[] nums) {
        
        int totalSum = 0;
        
        for(int index = 0; index < nums.length; index++)
            totalSum += nums[index];
        
        int leftSum = 0;
        
        for(int index = 0; index < nums.length; index++){
            
            totalSum -= nums[index];
            
            if(leftSum == totalSum)
                return index;
            
            leftSum += nums[index];
            
        }
        
        return -1;
        
    }
}