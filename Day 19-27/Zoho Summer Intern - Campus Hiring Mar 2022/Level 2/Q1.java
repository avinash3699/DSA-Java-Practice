// Insert an element in the array at the given position. Extra array should not be used.

import java.util.Scanner;

public class Q1 {
    
    static void insert(int[] arr, int N, int position, int elementToBeInserted){

        for(int index = N; index >= position; index--)
            arr[index] = arr[index-1];
        arr[position-1] = elementToBeInserted;

        printArray(arr);

    }

    static void printArray(int[] arr){
        for(int index = 0 ; index < arr.length; index++)
            System.out.print(arr[index] + " ");
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), index;
        int[] arr = new int[N+1];
        for(index = 0; index < N; index++)
            arr[index] = sc.nextInt();
        // arr[index] = 0;
        int position = sc.nextInt();
        int elementToBeInserted = sc.nextInt();

        insert(arr, N, position, elementToBeInserted);

    }


}