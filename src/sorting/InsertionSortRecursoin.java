package sorting;

import java.util.Scanner;

public class InsertionSortRecursoin {

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
		
		if (n <= 1) 
            return; 
       
        // Sort first n-1 elements 
		sort( arr, n-1 ); 
       
        // Insert last element at its correct position 
        // in sorted array. 
        int last = arr[n-1]; 
        int j = n-2; 
       
        /* Move elements of arr[0..i-1], that are 
          greater than key, to one position ahead 
          of their current position */
        while (j >= 0 && arr[j] > last) 
        { 
            arr[j+1] = arr[j]; 
            j--; 
        } 
        arr[j+1] = last;
	}
}
