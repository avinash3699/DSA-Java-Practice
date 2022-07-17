// Leetcode Problem Link: https://leetcode.com/problems/sort-an-array/
//                        https://leetcode.com/problems/sort-colors/

/*
What’s the issue with the normal QuickSort Algorithm?

If all elements are equal in an array, the left partition is empty
after the pivot operation and the right subarray only decreases by one. 
Therefore, the algorithm takes O(N^2) time in the worst case.

How to improve on the above algorithm?

We can use the concept of Dutch National Flag Problem. 
We can separate the values into three parts: 
    values equal to the pivot, 
    values less than pivot and 
    values greater than pivot. 
The pivot values are already sorted.
Therefore, we just need to sort the less than and greater than pivot values recursively.
*/

class Solution {
    public int[] sortArray(int[] array) {
        
        int low = 0, high = array.length-1;
        
        quickSortUsingDNF(array, low, high);
        
        return array;
        
    }
    
    public static void quickSortUsingDNF(int[] arr, int low, int high){
        
        if(low >= high) return;
        
        int values[] = partition(arr, low, high);
        quickSortUsingDNF(arr, low, values[0]);
        quickSortUsingDNF(arr, values[1], high);
        
    }
    
    public static int[] partition(int[] arr, int low, int high){
        
        int mid = low, pivot = arr[low];
        
        while(mid <= high){
              
            if(arr[mid] < pivot){
                swap(arr, low, mid);
                mid++;
                low++;
            }
            else if(arr[mid] > pivot){
                swap(arr, mid, high);
                high--;
            }
            else{
                mid++;
            }
        }
        
        int[] val = new int[]{low-1, mid};
        return val;
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}