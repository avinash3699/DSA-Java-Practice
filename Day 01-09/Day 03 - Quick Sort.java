// Leetcode Problem Link: https://leetcode.com/problems/sort-an-array/
// Explanation (English): https://www.youtube.com/watch?v=7h1s2SojIRw
//                        https://www.youtube.com/watch?v=QN9hnmAgmOc

class Solution {
    public int[] sortArray(int[] nums) {
        
        quickSort(nums, 0, nums.length-1);
        
        return nums;
        
    }
    
    public static void quickSort(int[] arr, int low, int high){
        
        if(low < high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
        
    }
    
    // logic 1
    public static int partition(int[] arr, int low, int high){
        
        int pivotElement = arr[low];
        int ptr1 = low+1, ptr2 = high;
        
        while(ptr1 <= ptr2){
            
            if(arr[ptr1] <= pivotElement) ptr1++;
            else{
                swap(arr, ptr1, ptr2);
                ptr2--;
            }
            
        }
        
        swap(arr, low, ptr2);
        return ptr2;
        
    }
    
    // logic 2
    public static int partition(int[] arr, int low, int high){
        
        int ptr1 = low, ptr2 = high;
        int pivotElement = arr[low];
        
        while(ptr1 < ptr2){
            
            while((arr[ptr1] <= pivotElement) && (ptr1 < high)) ptr1++;
            while((arr[ptr2] > pivotElement) && (ptr2 > low)) ptr2--;
            if(ptr1 < ptr2) swap(arr, ptr1, ptr2);
            
        }
        
        swap(arr, low, ptr2);
        return ptr2;
        
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}