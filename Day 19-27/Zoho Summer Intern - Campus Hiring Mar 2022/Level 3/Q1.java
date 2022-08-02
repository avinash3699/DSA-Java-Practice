// Given two arrays 'arr1' and 'arr2' of size N. Print "yes" if arr2 can be formed using the elements of arr1, else "no".

// Input:
// arr1 = [1, 2, 3, 4]
// arr2 = [4, 2, 1, 3]

// Output:
// yes

// Explanation: The arr2 elements 4, 2, 1, 3 are present in arr1 also the same number of times. Hence "yes" is printed

// Input:
// arr1 = [1, 2, 3, 4, 1, 4]
// arr2 = [4, 2, 1, 3, 3, 1]

// Output:
// no

import java.util.Scanner;

public class Q1{
	
	static int N;
	static Scanner sc = new Scanner(System.in);

	static int getFrequency(int[] arr, int num){
		int freq = 0;
		for(int index = 0; index < N; index++)
			if(arr[index] == num) freq++;
		return freq;
	}

	static int[] getArrayInput(){
		int arr[] = new int[N];
		for(int index = 0; index < N; index++)
			arr[index] = sc.nextInt();
		return arr;
	}

	public static void main(String[] args){

		//Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int canBeFormed = 1;
		int A[] = getArrayInput(), B[] = getArrayInput();
		
		for(int index = 0; index < N; index++){
			int AFreq = getFrequency(A, A[index]), BFreq = getFrequency(B, A[index]);
			if(AFreq != BFreq){
				canBeFormed = 0;
				break;
			}
		}

		if(canBeFormed == 1) System.out.print("yes");
		else System.out.print("no");
	}
}