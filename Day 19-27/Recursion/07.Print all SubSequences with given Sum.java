import java.util.Stack;

public class Main
{
    
    static void printSubsequences(int[] arr, int index, int N, Stack stack, int currSum, int reqSum){
        
        if(currSum == reqSum){
            System.out.println(stack);
            return;
        }
        
        if(index == N)
            return;
        
        stack.push(arr[index]);
        currSum += arr[index];
        
        printSubsequences(arr, index+1, N, stack, currSum, reqSum);

        stack.pop();
        currSum -= arr[index];
        
        printSubsequences(arr, index+1, N, stack, currSum, reqSum);
        
    }
    
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6};
		int sum = 10;
		
 		printSubsequences(arr, 0, arr.length, new Stack<Integer>(), 0, sum);
		
	}
}

// Output:

// [1, 2, 3, 4]
// [1, 3, 6]
// [1, 4, 5]
// [2, 3, 5]
// [4, 6]