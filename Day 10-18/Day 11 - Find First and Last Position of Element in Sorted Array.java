// Leetcode Problem Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int low = 0, high = nums.length-1, targetIndex = -1;
        int[] indicesArray = {-1, -1};
        
        while(low <= high){
            
            int mid = low + ((high - low)/2);
            
            if(nums[mid] == target){
                targetIndex = mid;
                break;
            }
            
            else if(nums[mid] < target)
                low = mid + 1;
            
            else
                high = mid - 1;
            
        }
        
        if(targetIndex == -1)
            return indicesArray;
        
        low = targetIndex;
        high = targetIndex;
        
        while( (low >= 0) && (nums[low] == target) ) low--;
        while( (high < nums.length) && (nums[high] == target) ) high++;
        
        indicesArray[0] = low + 1;
        indicesArray[1] = high - 1;
        
        return indicesArray;
        
    }
}