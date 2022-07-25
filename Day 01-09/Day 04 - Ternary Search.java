// Leetcode Problem Link: https://leetcode.com/problems/binary-search/

class Solution {
    public int search(int[] nums, int target) {
        
        int searchElementIndex = ternarySearch(nums, target, 0, nums.length - 1);
        return searchElementIndex;
        
    }
    
    
    // iterative approach
    public static int ternarySearch(int[] arr, int searchElement, int low, int high){
        
        while(low <= high){
            
            int mid1 = low + ((high - low)/3);
            int mid2 = high - ((high - low)/3);
            
            if(arr[mid1] == searchElement)
                return mid1;
            
            if(arr[mid2] == searchElement)
                return mid2;
            
            if(arr[mid1] > searchElement)
                high = mid1 - 1;
            
            else if(arr[mid2] < searchElement)
                low = mid2 + 1;
            
            else{
                low = mid1 + 1;
                high = mid2 - 1;
            }
               
        }
        
        return -1;
    }
}