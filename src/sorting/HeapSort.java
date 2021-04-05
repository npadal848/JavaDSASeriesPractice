package sorting;

import java.util.Scanner;

public class HeapSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		for(int i=1; i<=n; i++) {
			arr[i]=sc.nextInt();
		}
		
		createMaxHeap(arr, n);
		
		for(int i=1; i<=n; i++) System.out.print(arr[i]+" ");
	}

	static void createMaxHeap(int[] arr, int n) {
		for (int i = 1; i <=n; i++) {
			int j = i;
			
			while (j > 1) {
				int parent = j >> 1;
				
				if (arr[parent] < arr[j]) {
					arr[parent] = arr[parent] ^ arr[j];
					arr[j] = arr[parent] ^ arr[j];
					arr[parent] = arr[parent] ^ arr[j];
					j=parent;
				}else break;
			}
		}
	}
	
	static void add(int[] arr, int data, int n) {
		
	}

	static void sort(int[] arr, int n) {

		
	}
}
