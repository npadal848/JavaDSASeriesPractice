package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 8, 9, 0, 8, 6, -9 };
		int n = arr.length;
		System.out.println("length " + n);
		int temp = 0;

		for (int i = 0; i < n - 1; i++) {

			int minIndex = i;
			for (int j = i; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		for (int item : arr) {
			System.out.print(item + " ");
		}

	}
}
