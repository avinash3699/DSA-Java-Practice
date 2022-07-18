// Leetcode Problem Link: https://leetcode.com/problems/search-insert-position/

// The logic is same as that of Binary Search, but instead of returning -1, return low

class Solution {
    public int searchInsert(int[] arr, int searchElement) {
        
        int low = 0, high = arr.length - 1;
        
        while(low <= high){
            
            int mid = (low + high) / 2;
            
            if(arr[mid] == searchElement)
                return mid;
            
            else if(arr[mid] < searchElement)
                low = mid + 1;
            
            else if(arr[mid] > searchElement)
                high = mid - 1;
            
        }
        
        return low;
        
    }
}