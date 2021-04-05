package sorting;

import java.util.Scanner;

public class QuickSort {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		sort(arr, 0, size-1);
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}
	
	static void sort(int[] a, int start, int end) {
		if(start<end) {
			int pIndex=partition(a, start, end);
			
			sort(a, start, pIndex-1);
			sort(a, pIndex+1, end);
		}
	}
	static int partition(int[] a, int start, int end) {
		int pIndex=start;
		int pivot=a[end];
		int temp=0;
		
		for(int i=start; i<end; i++) {
			
			if(a[i]<=pivot) {
				temp=a[i];
				a[i]=a[pIndex];
				a[pIndex]=temp;
				pIndex++;
			}
		}
		temp=a[pIndex];
		a[pIndex]=a[end];
		a[end]=temp;

		return pIndex;
	}

}
