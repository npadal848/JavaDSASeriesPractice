package sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i <n; i++) {
			
			arr[i]=sc.nextInt();
		}
		sort(arr, n);
		
		for(int a: arr) {
			System.out.print(a+" ");
		}
	}

	private static void sort(int[] arr, int n) {
		
		for(int i=1; i<n; i++) {
			int currentEle=arr[i];
			int j=i-1;
			
			while(j>=0 && currentEle<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=currentEle;
		}
	}
}
