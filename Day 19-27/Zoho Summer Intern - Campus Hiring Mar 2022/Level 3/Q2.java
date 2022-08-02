// Given an array 'arr' of N integers and an integer K(window size). The program must print the minimum and the maximum values of all the subarrays(window) of size K.

import java.util.Scanner;

public class Q2{

	static void printArray(int arr[], int size){
		for(int index = 0; index < size; index++)
			System.out.print(arr[index] + " ");
		System.out.println();
	}

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int index = 0; index < N; index++){
			arr[index] = sc.nextInt();
		}
		int K = sc.nextInt();

		int maxValues[] = new int[N], minValues[] = new int[N], maxIndex = 0, minIndex = 0;

		for(int ind1 = 0; ind1 < N-K+1; ind1++){
			int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
			for(int ind2 = ind1; ind2 < ind1+K; ind2++){
				int currentNumber = arr[ind2];
				if(currentNumber > max) max = currentNumber;
				else if(currentNumber < min) min = currentNumber;
			}
			maxValues[maxIndex++] = max;
			minValues[minIndex++] = min;
		}
		
		System.out.print("Max : ");
		printArray(maxValues, maxIndex);
		System.out.print("Min : ");
		printArray(minValues, minIndex);
	}
}