import java.util.Stack;
// import java.util.ArrayList;

public class Main
{
    
    static void printSubsequences(int[] arr, int index, int N, Stack stack){
        
        if(index == N){
            System.out.println(stack);
            return;
        }
        
        stack.push(arr[index]);
        
        printSubsequences(arr, index+1, N, stack);

        stack.pop();
        
        printSubsequences(arr, index+1, N, stack);
        
    }
    
    // static void printSubsequences(int[] arr, int index, int N, ArrayList arrList){
        
    //     if(index == N){
    //         System.out.println(arrList);
    //         return;
    //     }
        
    //     arrList.add(arr[index]);
        
    //     printSubsequences(arr, index+1, N, arrList);

    //     arrList.remove(arrList.size() - 1);
        
    //     printSubsequences(arr, index+1, N, arrList);
        
    // }
    
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};
		
 		printSubsequences(arr, 0, arr.length, new Stack<Integer>());
        // printSubsequences(arr, 0, arr.length, new ArrayList<Integer>());
		
	}
}