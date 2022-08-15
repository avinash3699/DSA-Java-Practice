// Print all the non contiguous subarray of K elements in an array of N elements whose sum is equal to a given value.
// https://stackoverflow.com/questions/64125807/check-if-there-exists-a-non-contiguous-subarray-of-k-elements-in-an-array-of-n-e

// Print all the non contiguous subarray of K elements in an array of N elements whose sum is equal to a given value.
// https://stackoverflow.com/questions/64125807/check-if-there-exists-a-non-contiguous-subarray-of-k-elements-in-an-array-of-n-e

import java.util.Stack;

public class Main
{
    
    static boolean printSubsequences(int[] arr, int index, int N, Stack stack, int currSum, int reqSum, int elementsUsed, int K){
        
        if( (currSum == reqSum) && (elementsUsed == K) )
                return true;
        
        if(index == N){
            return false;
        }
        
        stack.push(arr[index]);
        currSum += arr[index];
        
        if( printSubsequences(arr, index+1, N, stack, currSum, reqSum, elementsUsed+1, K) == true )
            return true;

        stack.pop();
        currSum -= arr[index];
        
        if( printSubsequences(arr, index+1, N, stack, currSum, reqSum, elementsUsed, K) == true )
            return true;
            
        return false;
        
    }
    
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6};
		int sum = 10, K = 4;
		
 		System.out.print(printSubsequences(arr, 0, arr.length, new Stack<Integer>(), 0, sum, 0, K));
		
	}
}