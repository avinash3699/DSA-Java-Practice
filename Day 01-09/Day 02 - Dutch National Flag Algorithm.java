// Leetcode Problem Link: https://leetcode.com/problems/sort-colors/
// Explanation (English): https://www.youtube.com/watch?v=yj_14t67Bh0
//                        https://www.youtube.com/watch?v=9pdkbqGwUhs

class Solution {
    
    public static void swap(int[] nums, int ind1, int ind2){
        int temp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = temp;
    }
    
    public void sortColors(int[] nums) {
        
        int low, mid, high;
        low = 0; mid = 0;
        high = nums.length - 1;
        
        while(mid <= high){
            
            switch(nums[mid]){
                case 0:
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                    
                case 1:
                    mid++;
                    break;
                    
                case 2:
                    swap(nums, mid, high);
                    high--;
                    break;
                    
            } 
        }
    }
}
