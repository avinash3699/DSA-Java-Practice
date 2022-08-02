// Given an array 'arr' of N integers. Print the minimum number of swaps required to sort the array.

import java.util.Scanner;

public class Q3{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), swapsCount = 0;
		int arr[] = new int[N];
		for(int index = 0; index < N; index++)
			arr[index] = sc.nextInt();
		
		while(true){
			int swappedAny = 0;
			for(int index = 0; index < N-1; index++){
				if(arr[index] > arr[index+1]){
					int tempIndex = index+1;
					while(tempIndex < N && arr[tempIndex] < arr[index]) tempIndex++;
					int temp = arr[index];
					arr[index] = arr[tempIndex-1];
					arr[tempIndex-1] = temp;
					swappedAny = 1;	
					swapsCount++;
				}
			}
			if(swappedAny == 0) break;
		}

		System.out.println("Minimum number of swaps : " + swapsCount);
		System.out.print("Array in increasing order : ");
		for(int index = 0; index < N; index++) System.out.print(arr[index] + " ");
	}
}