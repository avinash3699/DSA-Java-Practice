// Leetcode Problem Link: https://leetcode.com/problems/binary-search/

// The above leetcode link can be used to check the correctness of your Interpolation Search code.
// However, Interpolation Search cannot be used in place of Binary Search

// The Interpolation Search is an improvement over Binary Search for instances, where the values in a sorted array are uniformly distributed.

class Solution {
    public int search(int[] nums, int target) {
        
        int searchElementIndex = interpolationSearch(nums, target);
        return searchElementIndex;
        
    }
    
    public static int interpolationSearch(int[] arr, int searchElement){
	    
        if( (arr.length == 1) && (arr[0] == searchElement))
            return 0;
        
	    int low = 0, high = arr.length - 1, pos;
	    
	    while( (low <= high) && (arr[low] <= searchElement) && (arr[high] >= searchElement)){
	        
	        pos = low + ( ( (searchElement - arr[low]) * (high - low) ) / (arr[high] - arr[low]) );
	        
	        if(arr[pos] == searchElement)
	            return pos;
	            
	        else if(arr[pos] > searchElement)
	            high = pos - 1;
	            
	        else if(arr[pos] < searchElement)
	            low = pos + 1;
	        
	    }
	    
	    return -1;
	}
}