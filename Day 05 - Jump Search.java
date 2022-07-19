// Leetcode Problem Link: https://leetcode.com/problems/binary-search/

// The above leetcode link can be used to check the correctness of your Jump Search code.
// However, Jump Search cannot be used in place of Binary Search as the time complexity of Jump Search is more than that of Binary Search

class Solution {
    public int search(int[] nums, int target) {
        
        int searchElementIndex = jumpSearch(nums, target);
        return searchElementIndex;
        
    }
    
    public static int jumpSearch(int[] arr, int searchElement){
        
        int size = arr.length;
        int step = (int)Math.floor(Math.sqrt(size));
        int start = 0, end = step;
        
        while( (end < size) && (arr[end] <= searchElement)){
            
            start += step;
            end += step;
            
            if(end >= size)
                end = size;
            
        }
        
        for(int index = start; index < end; index++){
            
            if(arr[index] == searchElement)
                return index;
            
        }
        
        return -1;
        
    }
}