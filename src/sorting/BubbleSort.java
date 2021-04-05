package sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 8, 9, 0, 8, 6, -9 };
		int n = arr.length;
		System.out.println("length "+n);
		int temp = 0;
		for (int i = 0; i < n - 1; i++) {

			boolean sorted=true; 
			for (int j = 0; j < n - 1-i; j++) {
				if (arr[j + 1] < arr[j]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					sorted =false;
				}
			}
			if(sorted) break;
		}
		for(int item: arr) {
			System.out.print(item+" ");
		}
	}

}
