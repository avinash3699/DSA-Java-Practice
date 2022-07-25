// Leetcode Problem Link: https://leetcode.com/problems/binary-search/

class Solution {
    public int search(int[] nums, int target) {
        
        int searchElementIndex = binarySearch(nums, target, 0, nums.length - 1);
        return searchElementIndex;
        
    }
    
    // recursive approach
    public static int binarySearch(int[] arr, int searchElement, int low, int high){
        
        if (low <= high){
            
            int mid = (low + high) / 2;
            
            if(arr[mid] == searchElement)
                return mid;
            
            else if(arr[mid] < searchElement)
                low = mid + 1;
            
            else if(arr[mid] > searchElement)
                high = mid - 1;
            
            return binarySearch(arr, searchElement, low, high);
            
        }
        
        return -1;
        
    }
    
    
    // iterative approach
    public static int binarySearch(int[] arr, int searchElement, int low, int high){
        
        while(low <= high){
            
            int mid = (low + high) / 2;
            
            if(arr[mid] == searchElement)
                return mid;
            
            else if(arr[mid] < searchElement)
                low = mid + 1;
            
            else if(arr[mid] > searchElement)
                high = mid - 1;
            
        }
        
        return -1;

    }
}