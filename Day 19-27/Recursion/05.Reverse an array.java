import java.util.Scanner;

public class Main
{
    
    static void reverseArray(int[] arr, int ptr1){
        
        if( ptr1 >= (arr.length - ptr1 - 1) )
            return;
        
        // swap
        int temp = arr[ptr1];
        arr[ptr1] = arr[arr.length - ptr1 - 1];
        arr[arr.length - ptr1 - 1] = temp;
        
        reverseArray(arr, ptr1+1);
        
    }
    
    // static void reverseArray(int[] arr, int ptr1, int ptr2){
        
    //     if(ptr1 >= ptr2)
    //         return;
        
    //     // swap
    //     int temp = arr[ptr1];
    //     arr[ptr1] = arr[ptr2];
    //     arr[ptr2] = temp;
        
    //     reverseArray(arr, ptr1+1, ptr2-1);
        
    // }
    
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int index = 0; index < N; index++) arr[index] = sc.nextInt();
		
		// reverseArray(arr, 0, arr.length-1);
		reverseArray(arr, 0);
		
		for(int index = 0; index < N; index++) System.out.print(arr[index] + " ");
		
	}
}
